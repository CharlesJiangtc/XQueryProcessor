//imports
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

import org.w3c.dom.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class Xpath {
    public static void main(String[] args) {
        //test inputs
        String test1 = "doc(\"s_caesar.xml\")//ACT";
        String test2 = "doc(\"j_caesar.xml\")/PLAY/ACT[SCENE/SPEECH/SPEAKER/text() = \"BRUTUS\"]";
        String test3 = "doc(\"s_caesar.xml\")//ACT[SCENE[SPEECH/SPEAKER/text() = \"CAESAR\"] [SPEECH/SPEAKER/text() = \"BRUTUS\"]]";
        String test4 = "doc(\"j_caesar.xml\")//ACT[SCENE [SPEECH/SPEAKER/text() = \"CAESAR\" and SPEECH/SPEAKER/text() = \"BRUTUS\"]] ";
        String test5 = "doc(\"j_caesar.xml\")//ACT[SCENE [SPEECH/SPEAKER/text() = \"CAESAR\" or SPEECH/SPEAKER/text() = \"BRUTUS\"]] ";
        String test6 = "doc(\"j_caesar.xml\")//ACT[not .//SPEAKER/text() = \"CAESAR\"]";
        String test7 = "doc(\"text1.xml\")//actor/@id";
        String test8 = "doc(\"text1.xml\")//actor[@ id=\"1\"]";

        //read input
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
                    MyVisitor visitor = new MyVisitor();
                    ArrayList<Node> result = visitor.visit(pTree);

                    if (result != null) {
                        System.out.println("query done. showing result for query : " + query + ". result size : " + result.size());
                        System.out.println("---------------------");
                        for (Node n : result) {
//                            System.out.println("result node type : " + n.getNodeType());
                            if (n.getNodeType() == 2) {
                                System.out.println(n.getNodeValue());
                            }
                            System.out.println(nodeToString(n));
//                            System.out.println("node " + n + " of type " + n.getNodeType() + " has a name : " + n.getNodeName());
                        }
                        //brief
                        for (Node n : result) {
                            System.out.println("node " + n + " of type " + n.getNodeType() + " has a name : " + n.getNodeName());
                        }
                        System.out.println("result size : " + result.size());
                    }
                }
                catch (Exception e) {
                    System.out.println("error occurs in the query : " + query);
                }
                System.out.println("---------------------");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File " + args[0] + " not found.");
        }
        System.out.println("=======end of queries=======");


//        ANTLRInputStream antlrIS = new ANTLRInputStream(test8);
////        System.out.println("flag1");
//
//        //parser
//        XpathLexer xpLexer = new XpathLexer(antlrIS);
//        CommonTokenStream commonTS = new CommonTokenStream(xpLexer);
//        XpathParser xpParser = new XpathParser(commonTS);
//        ParseTree pTree = xpParser.ap();
////        System.out.println("flag2");
//
//        //visit
//        MyVisitor visitor = new MyVisitor();
//        ArrayList<Node> result = visitor.visit(pTree);
////        System.out.println("flag3");
//        if (result != null) {
//            System.out.println("result size : " + result.size());
//            for (Node n : result) {
//                System.out.println("node " + n + " of type " + n.getNodeType() + " has a name : " + n.getNodeName());
//            }
//        }
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
}