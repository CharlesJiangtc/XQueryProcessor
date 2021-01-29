//imports
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

import org.w3c.dom.Node;


public class Xpath {
    public static void main(String[] args) {
        //read input
        String test = "doc(\"j_caesar.xml\")/PERSONA";
        System.out.println(test);
        ANTLRInputStream antlrIS = new ANTLRInputStream(test);
        System.out.println("flag1");

        //parser
        XpathLexer xpLexer = new XpathLexer(antlrIS);
        CommonTokenStream commonTS = new CommonTokenStream(xpLexer);
        XpathParser xpParser = new XpathParser(commonTS);
        ParseTree pTree = xpParser.ap();
        System.out.println("flag2");

        //visit
        MyVisitor visitor = new MyVisitor();
        ArrayList<Node> result = visitor.visit(pTree);
        System.out.println("flag3");

    }

}