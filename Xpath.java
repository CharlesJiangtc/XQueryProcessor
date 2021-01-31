import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

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
                        for (Node n : result) {
                            if (n.getNodeType() == 2) {
                                System.out.println(n.getNodeValue());
                            }
                            System.out.println(nodeToString(n));
                        }
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
}
        //String test = "doc(\"j_caesar.xml\")/PLAY";                   //test ap_children                              passed  return 1
        //String test = "doc(\"j_caesar.xml\")/PLAY/PERSONAE/PGROUP";   //test ap_children  rp_children                 passed  return 6
        //String test = "doc(\"j_caesar.xml\")/PLAY/FM/*";              //test ap_children  rp_descendant               passed  return 4
        //String test = "doc(\"j_caesar.xml\")/PLAY//ACT";              //test ap_children  rp_all                      passed  return 5
        //String test = "doc(\"j_caesar.xml\")/PLAY//*";                //test ap_children  rp_all  rp_descendant       passed  return 4454
        //String test = "doc(\"j_caesar.xml\")//PERSONA";               //test ap_all                                   passed  return 36
        //String test = "doc(\"j_caesar.xml\")/PLAY/.";                 //test rp_sibling                               passed  return 1
        //String test = "doc(\"j_caesar.xml\")/PLAY/TITLE/..";          //test rp_parent                                passed  return 1
        //String test = "doc(\"j_caesar.xml\")//ACT[not .SPEAKER/text() = \"CAESAR\"]/. ";          //test rp_sibling  filter_not  rp_all  rp_sibling   passed  return 5
        //String test = "doc(\"j_caesar.xml\")//ACT[not .//SPEAKER/text() = \"CAESAR\"] ";          //test rp_sibling  filter_not  rp_all  rp_parent    passed  return 2
        //String test = "doc(\"j_caesar.xml\")//PLAYSUBT/text() = \"JULIUS CAESAR\"";               //test rp_filter  rp_txt                            passed  return 1
        //String test = "doc(\"j_caesar.xml\")//PLAYSUBT[./text() = \"JULIUS CAESAR\"] ";           //test rp_filter  rp_txt                            passed  return 1
        //String test = "doc(\"j_caesar.xml\")//SCENE[SPEECH/SPEAKER/text() = \"CAESAR\"] ";        //test filter_txt                                   passed  return 3
        //String test = "doc(\"j_caesar.xml\")//SPEECH[.//SPEAKER/text() = \"Second Commoner\"] ";  //test filter_txt  rp_all rp_sibling                passed  return 6
        //String test = "doc(\"j_caesar.xml\")//SCENE[./* is (./STAGEDIR[./text() = \"Exeunt\")] "; //test filter_is  filter_txt                        passed  return 14
        //String test = "doc(\"j_caesar.xml\")//(PLAYSUBT[./text() = \"JULIUS CAESAR\"] , ACT[not .//SPEAKER/text() = \"CAESAR\"] ";        //test filet_txt  rp_merge          passed  return 3
        //String test = "doc(\"j_caesar.xml\")//SPEECH[./SPEAKER/text() eq ./../../..//PERSONA[./text() = \"MESSALA\"]/text() ";            //test rp_parent  filter_equal      passed  return 21
        //String test = "doc(\"j_caesar.xml\")//ACT[SCENE [SPEECH/SPEAKER/text() = \"CAESAR\"] [SPEECH/SPEAKER/text() = \"BRUTUS\"]] ";     //test rp_filter  filter_txt        passed  return 3
        //String test = "doc(\"j_caesar.xml\")//ACT[SCENE [SPEECH/SPEAKER/text() = \"CAESAR\" and SPEECH/SPEAKER/text() = \"BRUTUS\"]] ";   //test filter_and  filter_or        passed  return 3

        /*ANTLRInputStream antlrIS = new ANTLRInputStream(test);
        XpathLexer xpLexer = new XpathLexer(antlrIS);
        CommonTokenStream commonTS = new CommonTokenStream(xpLexer);
        XpathParser xpParser = new XpathParser(commonTS);
        ParseTree pTree = xpParser.ap();
        Visitor visitor = new Visitor();
        ArrayList<Node> result = visitor.visit(pTree);*/