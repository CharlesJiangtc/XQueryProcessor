import java.util.ArrayList;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class Xpath {
    public static void main(String[] args) {
        //read input
        //String test = "doc(\"s_caesar.xml\")//ACT";
        //String test = "doc(\"j_caesar.xml\")//SCENE[SPEECH/SPEAKER/text() = \"CAESAR\"] ";
        //String test = "doc(\"j_caesar.xml\")//ACT[SCENE [SPEECH/SPEAKER/text() = \"CAESAR\"] [SPEECH/SPEAKER/text() = \"BRUTUS\"]] ";
        //String test = "doc(\"j_caesar.xml\")//ACT[SCENE [SPEECH/SPEAKER/text() = \"CAESAR\" and SPEECH/SPEAKER/text() = \"BRUTUS\"]] ";
        String test = "doc(\"j_caesar.xml\")//ACT[not .//SPEAKER/text() = \"CAESAR\"] ";
        System.out.println("testing " + test);
        ANTLRInputStream antlrIS = new ANTLRInputStream(test);

        //parser
        XpathLexer xpLexer = new XpathLexer(antlrIS);
        CommonTokenStream commonTS = new CommonTokenStream(xpLexer);
        XpathParser xpParser = new XpathParser(commonTS);
        ParseTree pTree = xpParser.ap();
        //visit
        Visitor visitor = new Visitor();
        ArrayList<Node> result = visitor.visit(pTree);
        //System.out.println(result.size());
        System.out.println(result.size());

        /*for(Node res : result) {
            for(int i=0; i<result.size(); i++) {
                if(res.getNodeType()==Node.ELEMENT_NODE){
                    System.out.println(res);
                }
            }
        }*/
    }
}