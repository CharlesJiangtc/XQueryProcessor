package ms1;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


public class Xpath {
    public static void main( String[] args) throws IOException {
        InputStream input = System.in;
        //setup ANTLR
        ANTLRInputStream in = new ANTLRInputStream(input);
        XpathLexer lexer = new XpathLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XpathParser parser = new XpathParser(tokens);
        ParseTree tree = parser.ap();
        Visitor evaluation = new Visitor();
        return;

    }

}