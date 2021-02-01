import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class Xpath {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("=======Input queries file missing!=======");
            return;
        }
        try {
            File inputFile = new File(args[0]);

            Scanner scanner = new Scanner(inputFile);

            System.out.println("=======starting queries=======");

            while (scanner.hasNextLine()) {
                String query = scanner.nextLine();
                System.out.println("querying : " + query);
                try {
                    ANTLRInputStream antlrIS = new ANTLRInputStream(query);

                    //parser
                    XpathLexer xpLexer = new XpathLexer(antlrIS);
                    CommonTokenStream commonTS = new CommonTokenStream(xpLexer);
                    XpathParser xpParser = new XpathParser(commonTS);
                    ParseTree pTree = xpParser.ap();

                    //visit
                    Visitor visitor = new Visitor();
                    ArrayList<Node> result = visitor.visit(pTree);
                    if (result != null) {
                        System.out.println("query done. showing result for query : " + query + ". result size : " + result.size());
                        System.out.println("---------------------");
                        // for (Node n : result) {
                        //     if (n.getNodeType() == 2) {
                        //         System.out.println(n.getNodeValue());
                        //     }
                        //     System.out.println(nodeToString(n));
                        // }
                        nodesToXML(result, args[0]);
                    }
                } catch (Exception e) {
                    System.out.println("error occurs in the query : " + query);
                }
                System.out.println("---------------------");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + args[0] + " not found.");
        }
        System.out.println("=======end of queries=======");
    }

    private static String nodeToString(Node node) {
        StringWriter sw = new StringWriter();
        try {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node), new StreamResult(sw));
        } catch (TransformerException te) {
            System.out.println("nodeToString Transformer Exception");
        }
        return sw.toString();
    }

    private static void nodesToXML(ArrayList<Node> nodes, String inputFileName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = doc.createElement("Result");
            doc.appendChild(root);

            for (Node n : nodes) {
                root.appendChild(doc.importNode(n,true));
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transf = transformerFactory.newTransformer();
            
            transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transf.setOutputProperty(OutputKeys.INDENT, "yes");
            transf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            
            DOMSource source = new DOMSource(doc);

            String outputFileName = "Result_"+ inputFileName + ".xml";

            File myFile = new File(outputFileName);
            
            StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(myFile);

            transf.transform(source, console);
            transf.transform(source, file);
            System.out.println("result file generated. file name : " + outputFileName);
        }
        catch (Exception e) {
            System.out.println("generating xml file failed.");
        }
    }
}