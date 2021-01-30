import java.util.*;



import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class MyVisitor extends XpathBaseVisitor<ArrayList> {

    ArrayList<Node> currNodes = new ArrayList<Node>();

    short elementNodeTypeCode = 1;
    short attrNodeTypeCode = 2;
    short textNodeTypeCode = 3;



    @Override public ArrayList<Node> visitAp_children(XpathParser.Ap_childrenContext ctx) {

        visit(ctx.doc());
        return visit(ctx.rp());
    }


    @Override public ArrayList<Node> visitAp_all(XpathParser.Ap_allContext ctx) {

        visit(ctx.doc());


        currNodes.addAll(getAll(currNodes));

        return visit(ctx.rp());
    }


    @Override public ArrayList<Node> visitDoc(XpathParser.DocContext ctx) {
        File inputDoc = new File(System.getProperty("user.dir") + "/" + ctx.filename().getText());


        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(inputDoc);

            document.getDocumentElement().normalize();

            ArrayList<Node> curr = new ArrayList();
            curr.add(document);
            currNodes = curr;


            return curr;
        }
        catch (Exception e) {
            System.out.println("catch exception during dealing with xml doc. /// " + e);
        }
        currNodes = new ArrayList<Node>();
        return currNodes;
    }




    @Override public ArrayList<Node> visitFilename(XpathParser.FilenameContext ctx) {
        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_txt(XpathParser.Rp_txtContext ctx) {
        ArrayList<Node> res = new ArrayList<Node>();
        for (Node n : getChildren(currNodes)) {


            if (n.getNodeType() == textNodeTypeCode) {
                res.add(n);

            }
        }

        currNodes = res;
        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_attName(XpathParser.Rp_attNameContext ctx) {

        ArrayList<Node> res = new ArrayList<Node>();

        for (Node n : currNodes) {


            if (n.getAttributes() != null && n.getAttributes().getNamedItem(ctx.TAGNAME().getText()) != null) {
                res.add(n.getAttributes().getNamedItem(ctx.TAGNAME().getText()));
            }
        }
        currNodes = res;


        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_parent(XpathParser.Rp_parentContext ctx) {

        ArrayList<Node> res = new ArrayList<Node>();
        for (Node n : currNodes) {
            if (!res.contains(n.getParentNode())) {
                res.add(n.getParentNode());
            }
        }

        return currNodes;
    }




    @Override public ArrayList<Node> visitRp_sibling(XpathParser.Rp_siblingContext ctx) {

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_descendant(XpathParser.Rp_descendantContext ctx) {

        currNodes = getChildren(currNodes);
        return currNodes;
    }




    @Override public ArrayList<Node> visitRp_self(XpathParser.Rp_selfContext ctx) {

        visit(ctx.rp());
        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_children(XpathParser.Rp_childrenContext ctx) {

        visit(ctx.rp(0));
        return visit(ctx.rp(1));
    }


    @Override public ArrayList<Node> visitRp_tagName(XpathParser.Rp_tagNameContext ctx) {

        ArrayList<Node> res = new ArrayList<Node>();

        for (Node n : getChildren(currNodes)) {
            if (n.getNodeType() == elementNodeTypeCode && n.getNodeName().equals(ctx.getText().trim())) {
                res.add(n);
            }
        }

        currNodes = res;

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_merge(XpathParser.Rp_mergeContext ctx) {

        ArrayList<Node> prevNodes = currNodes;
        ArrayList<Node> res = new ArrayList<Node>();

        ArrayList<Node> left = visit(ctx.rp(0));
        currNodes = prevNodes;
        ArrayList<Node> right = visit(ctx.rp(1));

        res.addAll(left);
        res.addAll(right);

        currNodes = res;
        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_filter(XpathParser.Rp_filterContext ctx) {

        visit(ctx.rp());
        currNodes = visit(ctx.filter());

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_all(XpathParser.Rp_allContext ctx) {

        visit(ctx.rp(0));
        currNodes.addAll(getAll(currNodes));
        return visit(ctx.rp(1));
    }


    @Override public ArrayList<Node> visitFilter_rp(XpathParser.Filter_rpContext ctx) {


        ArrayList<Node> res = new ArrayList<Node>();
        ArrayList<Node> prevNodes = currNodes;

        for (Node n : prevNodes) {
            ArrayList<Node> tmp = new ArrayList<Node>();
            tmp.add(n);
            currNodes = tmp;
            if (visit(ctx.rp()).size() > 0) {
                res.add(n);
            }
        }
        currNodes = res;
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_and(XpathParser.Filter_andContext ctx) {

        ArrayList<Node> prevNodes = currNodes;
        ArrayList<Node> res = new ArrayList<Node>();

        ArrayList<Node> left = visit(ctx.filter(0));
        currNodes = prevNodes;
        ArrayList<Node> right = visit(ctx.filter(1));

        for (Node l : left) {
            for (Node r : right) {
                if (l.isSameNode(r)) {
                    res.add(l);
                }
            }
        }

        currNodes = res;

        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_parent(XpathParser.Filter_parentContext ctx) {

        visit(ctx.filter());
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_is(XpathParser.Filter_isContext ctx) {

        ArrayList<Node> prevNodes = currNodes;
        ArrayList<Node> res = new ArrayList<Node>();

        for (Node n : prevNodes) {
            ArrayList<Node> tmp = new ArrayList<Node>();
            tmp.add(n);
            currNodes = tmp;


            ArrayList<Node> left = visit(ctx.rp(0));
            currNodes = tmp;


            ArrayList<Node> right = visit(ctx.rp(1));


            for (Node l : left) {
                for (Node r : right) {
                    if (l.isSameNode(r)) {
                        res.add(n);
                    }
                }
            }
        }

        currNodes = res;
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_txt(XpathParser.Filter_txtContext ctx) {

        String ctxText = ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1);



        ArrayList<Node> prevNodes = currNodes;
        HashSet<Node> res = new HashSet<Node>();

        for (Node n : prevNodes) {
            ArrayList<Node> tmp = new ArrayList<Node>();
            tmp.add(n);
            currNodes = tmp;
            ArrayList<Node> left = visit(ctx.rp());
            for (Node l : left) {

                if (l.getNodeValue().equals(ctxText)) {
                    res.add(n);
                }
            }
        }

        currNodes = new ArrayList<Node>(res);
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_equal(XpathParser.Filter_equalContext ctx) {

        ArrayList<Node> prevNodes = currNodes;
        HashSet<Node> res = new HashSet<Node>();

        for (Node n : prevNodes) {
            ArrayList<Node> tmp = new ArrayList<Node>();
            tmp.add(n);
            currNodes = tmp;


            ArrayList<Node> left = visit(ctx.rp(0));
            currNodes = tmp;
            ArrayList<Node> right = visit(ctx.rp(1));

            for (Node l : left) {
                for (Node r : right) {
                    if (l.isEqualNode(r)) {
                        res.add(n);
                    }
                }
            }
        }

        currNodes = new ArrayList<Node>(res);
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_or(XpathParser.Filter_orContext ctx) {

        ArrayList<Node> prevNodes = currNodes;
        ArrayList<Node> res = new ArrayList<Node>();

        ArrayList<Node> left = visit(ctx.filter(0));
        currNodes = prevNodes;
        ArrayList<Node> right = visit(ctx.filter(1));

        res.addAll(left);
        for (Node r : right) {
            boolean hasDup = false;
            for (Node l : left) {
                if (r.isSameNode(l)) {
                    hasDup = true;
                }
            }
            if (!hasDup) {
                res.add(r);
            }
        }

        currNodes = res;

        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_not(XpathParser.Filter_notContext ctx) {

        ArrayList<Node> prevNodes = currNodes;
        ArrayList<Node> res = new ArrayList<Node>();

        ArrayList<Node> not = visit(ctx.filter());

        for (Node prev : prevNodes) {
            boolean found = false;
            for (Node n : not) {
                if (prev.isSameNode(n)) {
                    found = true;
                }
            }
            if (!found) {
                res.add(prev);
            }
        }

        currNodes = res;

        return currNodes;
    }

    private ArrayList<Node> getAll(ArrayList<Node> parentNodes) {
        ArrayList<Node> res = new ArrayList<Node>();
        ArrayList<Node> nextGen = getChildren(parentNodes);
        if (nextGen.size() == 0) {
            return new ArrayList<Node>(new HashSet<Node>(nextGen));
        }
        else {
            res.addAll(nextGen);
            res.addAll(getAll(nextGen));
        }
        res = new ArrayList<Node>(new HashSet<Node>(res));
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