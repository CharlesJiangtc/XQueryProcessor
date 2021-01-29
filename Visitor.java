package ms1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.*;

import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;


public class Visitor extends XpathBaseVisitor<ArrayList<Node>> {
    ArrayList<Node> result = new ArrayList<>();
    ArrayList<Node> descendant = new ArrayList<>();
    boolean all;

    @Override
    public ArrayList<Node> visitDoc(XpathParser.DocContext ctx) throws ParserConfigurationException, IOException, SAXException {
        File DOMtree = new File(ctx.filename().getText());
        //String filename = ctx.filename().getText();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(DOMtree);
        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        ArrayList<Node> a = new ArrayList<>();
        descendant.add(doc);
        a.add(doc);
        return a;
    }

    @Override
    public ArrayList<Node> visitAp_children(XpathParser.Ap_childrenContext ctx) {
        visit(ctx.doc());
        //ap = true;
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitAp_all(XpathParser.Ap_allContext ctx) {
        visit(ctx.doc());
        //ap = true;
        all = true;
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitRp_tagName(XpathParser.Rp_tagNameContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for (Node des : descendant) {
            int num = des.getChildNodes().getLength();
            for (int i = 0; i < num; i++) {
                if (des.getChildNodes().item(i).getNodeName() == ctx.getText()) {
                    temp.add(des.getChildNodes().item(i));
                }
            }
        }
        descendant = temp;
        return temp;
    }

    @Override
    public ArrayList<Node> visitRp_descendant(XpathParser.Rp_descendantContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitRp_sibling(XpathParser.Rp_siblingContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitRp_parent(XpathParser.Rp_parentContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitRp_txt(XpathParser.Rp_txtContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitRp_attName(XpathParser.Rp_attNameContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for (Node des : descendant) {
            Element desc = (Element) des;
            if (desc.getAttribute(ctx.NAME().getText()) != null) {

            }
        }
        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitRp_self(XpathParser.Rp_selfContext ctx) {
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitRp_children(XpathParser.Rp_childrenContext ctx) {
        visit(ctx.rp(0));
        return visit(ctx.rp(1));
    }

    @Override
    public ArrayList<Node> visitRp_all(XpathParser.Rp_allContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitRp_filter(XpathParser.Rp_filterContext ctx) {
        visit(ctx.rp());
        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitRp_merge(XpathParser.Rp_mergeContext ctx) {

        return visitChildren(ctx);
    }
}