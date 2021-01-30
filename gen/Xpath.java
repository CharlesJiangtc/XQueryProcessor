//imports
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

import org.w3c.dom.Node;


public class Xpath {
    public static void main(String[] args) {
        //read input
        String test1 = "doc(\"s_caesar.xml\")//ACT";
        String test2 = "doc(\"s_caesar.xml\")/PLAY/ACT/SCENE[SPEECH/SPEAKER/text() = \"BRUTUS\"]";
        String test3 = "doc(\"s_caesar.xml\")//ACT[SCENE[SPEECH/SPEAKER/text() = \"CAESAR\"] [SPEECH/SPEAKER/text() = \"BRUTUS\"]]";


        ANTLRInputStream antlrIS = new ANTLRInputStream(test3);
//        System.out.println("flag1");

        //parser
        XpathLexer xpLexer = new XpathLexer(antlrIS);
        CommonTokenStream commonTS = new CommonTokenStream(xpLexer);
        XpathParser xpParser = new XpathParser(commonTS);
        ParseTree pTree = xpParser.ap();
//        System.out.println("flag2");

        //visit
        MyVisitor visitor = new MyVisitor();
        ArrayList<Node> result = visitor.visit(pTree);
//        System.out.println("flag3");
        if (result != null) {
            System.out.println("result size : " + result.size());
            for (Node n : result) {
                System.out.println("node " + n + " of type " + n.getNodeType() + " has a name : " + n.getNodeName());
            }
        }
    }

}