import java.util.*;

//DOM
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class MyVisitor extends XpathBaseVisitor<ArrayList> {

    ArrayList<Node> currNodes = new ArrayList<Node>();


    @Override public ArrayList<Node> visitAp_children(XpathParser.Ap_childrenContext ctx) {
        System.out.println("in visitAP_chidlren()");

        visit(ctx.doc());
        return visit(ctx.rp());
    }


    @Override public ArrayList<Node> visitAp_all(XpathParser.Ap_allContext ctx) {
        System.out.println("in visitAP_all()");

        visit(ctx.doc());
        currNodes.addAll(getAll(getAll(currNodes)));

        printNodeList(currNodes);

        return visit(ctx.rp());
    }


    @Override public ArrayList<Node> visitDoc(XpathParser.DocContext ctx) {
        System.out.println("in visitDoc()");
        System.out.println(ctx.filename().getText());

        File inputDoc = new File(System.getProperty("user.dir") + "/" + ctx.filename().getText());
        System.out.println(inputDoc.getName());
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(inputDoc);

            document.getDocumentElement().normalize();

            ArrayList<Node> curr = new ArrayList();
            curr.add(document);
            currNodes = curr;
            printNodeList(currNodes);
            return curr;
        }
        catch (Exception e) {
            System.out.println("catch exception during dealing with xml doc. /// " + e);
        }
        currNodes = null;
        return null;
    }


    @Override public ArrayList<Node> visitFilename(XpathParser.FilenameContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_txt(XpathParser.Rp_txtContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_attName(XpathParser.Rp_attNameContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_parent(XpathParser.Rp_parentContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_sibling(XpathParser.Rp_siblingContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_descendant(XpathParser.Rp_descendantContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_self(XpathParser.Rp_selfContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_children(XpathParser.Rp_childrenContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_tagName(XpathParser.Rp_tagNameContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_merge(XpathParser.Rp_mergeContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_filter(XpathParser.Rp_filterContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitRp_all(XpathParser.Rp_allContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitFilter_rp(XpathParser.Filter_rpContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitFilter_and(XpathParser.Filter_andContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitFilter_parent(XpathParser.Filter_parentContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitFilter_is(XpathParser.Filter_isContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitFilter_equal(XpathParser.Filter_equalContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitFilter_or(XpathParser.Filter_orContext ctx) { return visitChildren(ctx); }


    @Override public ArrayList<Node> visitFilter_not(XpathParser.Filter_notContext ctx) { return visitChildren(ctx); }


    //helper methods
    private void printNodeList(ArrayList<Node> nodes) {
        System.out.println("=========printing all current nodes===========");
        for (Node n : nodes) {
            System.out.println(n.getNodeName());
        }
        System.out.println("=========done===========");
    }

    private ArrayList<Node> getAll(ArrayList<Node> parentNodes) {
        ArrayList<Node> res = new ArrayList<Node>();
        ArrayList<Node> nextGen = getChildren(parentNodes);
        if (nextGen.size() == 0) {
            return nextGen;
        }
        else {
            res.addAll(nextGen);
            res.addAll(getAll(nextGen));
        }
        return res;
    }

    private ArrayList<Node> getChildren(ArrayList<Node> parentNodes) {
        ArrayList<Node> res = new ArrayList<Node>();
        for (Node n : parentNodes) {
            for (int i = 0; i < n.getChildNodes().getLength(); i++) {
                res.add(n.getChildNodes().item(i));
            }
        }
        return res;
    }
}