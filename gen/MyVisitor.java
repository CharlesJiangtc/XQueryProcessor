import java.util.*;

//DOM
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class MyVisitor extends XpathBaseVisitor<ArrayList> {

    ArrayList<Node> currNodes = new ArrayList<Node>();

    short elementNodeTypeCode = 1;
    short attrNodeTypeCode = 2;
    short textNodeTypeCode = 3;



    @Override public ArrayList<Node> visitAp_children(XpathParser.Ap_childrenContext ctx) {
        System.out.println("in visitAP_chidlren()");

        visit(ctx.doc());
        return visit(ctx.rp());
    }


    @Override public ArrayList<Node> visitAp_all(XpathParser.Ap_allContext ctx) {
        System.out.println("in visitAP_all()");

        visit(ctx.doc());
//        printNodeList(currNodes);
        currNodes.addAll(getAll(currNodes));

//        printNodeList(currNodes);

        return visit(ctx.rp());
    }


    @Override public ArrayList<Node> visitDoc(XpathParser.DocContext ctx) {
        System.out.println("in visitDoc()");

        File inputDoc = new File(System.getProperty("user.dir") + "/" + ctx.filename().getText());
//        System.out.println(inputDoc.getName());
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(inputDoc);

            document.getDocumentElement().normalize();

            ArrayList<Node> curr = new ArrayList();
            curr.add(document);
            currNodes = curr;
//            printNodeList(currNodes);
            return curr;
        }
        catch (Exception e) {
            System.out.println("catch exception during dealing with xml doc. /// " + e);
        }
        currNodes = new ArrayList<Node>();
        return currNodes;
    }


    //undone
    @Override public ArrayList<Node> visitFilename(XpathParser.FilenameContext ctx) {
        System.out.println("in visitFilename()");

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_txt(XpathParser.Rp_txtContext ctx) {
        System.out.println("in visitRp_txt()");

//        printNodeList(currNodes);
        ArrayList<Node> res = new ArrayList<Node>();
        for (Node n : getChildren(currNodes)) {
//            System.out.println(n.getNodeType());
            if (n.getNodeType() == textNodeTypeCode) {
                res.add(n);
//                System.out.println("text Node" + n.getNodeValue());
            }
        }

        currNodes = res;
        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_attName(XpathParser.Rp_attNameContext ctx) {
        System.out.println("in visitRp_att() : " + ctx.TAGNAME().getText());

//        System.out.println("starting size : " + currNodes.size());

        ArrayList<Node> res = new ArrayList<Node>();

        for (Node n : currNodes) {
//            System.out.println("type : " + n.getNodeType() + ", name : " + n.getNodeName() + ", attr : " + n.getAttributes());

            if (n.getAttributes() != null && n.getAttributes().getNamedItem(ctx.TAGNAME().getText()) != null) {
                res.add(n.getAttributes().getNamedItem(ctx.TAGNAME().getText()));
            }
        }
        currNodes = res;
//        System.out.println("result size : " + currNodes.size());

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_parent(XpathParser.Rp_parentContext ctx) {
        System.out.println("in visitRp_parent");

        ArrayList<Node> res = new ArrayList<Node>();
        for (Node n : currNodes) {
            if (!res.contains(n.getParentNode())) {
                res.add(n.getParentNode());
            }
        }

        return currNodes;
    }


    //shouldn't '.' just be self rather than sibling?
    @Override public ArrayList<Node> visitRp_sibling(XpathParser.Rp_siblingContext ctx) {
        System.out.println("in visitRp_sibling()");

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_descendant(XpathParser.Rp_descendantContext ctx) {
        System.out.println("in visitRp_descendant()");

        currNodes = getChildren(currNodes);
        return currNodes;
    }


    //shouldn't parentheses mean do whatever in the parentheses first?
    @Override public ArrayList<Node> visitRp_self(XpathParser.Rp_selfContext ctx) {
        System.out.println("in visitRp_self()");

        visit(ctx.rp());
        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_children(XpathParser.Rp_childrenContext ctx) {
        System.out.println("in visitRp_children() : " + ctx.rp(0).getText() + " ; " + ctx.rp(1).getText());

        visit(ctx.rp(0));
        return visit(ctx.rp(1));
    }


    @Override public ArrayList<Node> visitRp_tagName(XpathParser.Rp_tagNameContext ctx) {
        System.out.println("in visitRp_tagName() : " + ctx.getText());
//        System.out.println(ctx.getText().trim().length());
//        System.out.println(ctx.TAGNAME().getText().length());

//        System.out.println("starting size : " + currNodes.size());
        ArrayList<Node> res = new ArrayList<Node>();

        for (Node n : getChildren(currNodes)) {
            if (n.getNodeType() == elementNodeTypeCode && n.getNodeName().equals(ctx.getText().trim())) {
                res.add(n);
            }
        }

        currNodes = res;
        printNodeList(currNodes);
//        System.out.println("result size : " + currNodes.size());

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_merge(XpathParser.Rp_mergeContext ctx) {
        System.out.println("in visitRp_Merge()");

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
        System.out.println("in visitRp_filter() : " + ctx.rp().getText() + " ; " + ctx.filter().getText());
//        System.out.println(currNodes.size());
//        printNodeList(currNodes);
        visit(ctx.rp());
        currNodes = visit(ctx.filter());

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_all(XpathParser.Rp_allContext ctx) {
        System.out.println("in visitRp_all()");

        visit(ctx.rp(0));
        currNodes.addAll(getAll(currNodes));
        return visit(ctx.rp(1));
    }


    @Override public ArrayList<Node> visitFilter_rp(XpathParser.Filter_rpContext ctx) {
        System.out.println("in visitFilter_rp() : " + ctx.rp().getText());
        printNodeList(currNodes);

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
        printNodeList(currNodes);
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_and(XpathParser.Filter_andContext ctx) {
        System.out.println("in visitFilter_and()");

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
        System.out.println("in visitFilter_parent()");

        visit(ctx.filter());
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_is(XpathParser.Filter_isContext ctx) {
        System.out.println("visitFilter_is");

        ArrayList<Node> prevNodes = currNodes;
        ArrayList<Node> res = new ArrayList<Node>();

        for (Node n : prevNodes) {
            ArrayList<Node> tmp = new ArrayList<Node>();
            tmp.add(n);
            currNodes = tmp;
//            System.out.println("visiting left...");
            ArrayList<Node> left = visit(ctx.rp(0));
            currNodes = tmp;
//            System.out.println("visiting right...");
            ArrayList<Node> right = visit(ctx.rp(1));
//            System.out.println("back to filter_eq");
//            System.out.println(left.size());
//            System.out.println(right.size());
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
        System.out.println("in visitFilter_txt()");
//        System.out.println(ctx.STRING().getText());

        String ctxText = ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1);
        System.out.println(ctxText);

//        printNodeList(currNodes);
        ArrayList<Node> prevNodes = currNodes;
        HashSet<Node> res = new HashSet<Node>();

        for (Node n : prevNodes) {
            ArrayList<Node> tmp = new ArrayList<Node>();
            tmp.add(n);
            currNodes = tmp;
            ArrayList<Node> left = visit(ctx.rp());
            System.out.println(left.size());
            for (Node l : left) {
//                System.out.println("left node type : " + l.getNodeType());
//
//                if (l.getNodeType() == textNodeTypeCode && l.getNodeValue().equals(ctxText)) {
//                    res.add(n);
//                }
//                else if (l.getNodeType() == attrNodeTypeCode && l.getNodeValue().equals(ctxText)) {
//                    System.out.println("attr node value : " + l.getNodeValue());
//                    res.add(n);
//                }
                if (l.getNodeValue().equals(ctxText)) {
                    res.add(n);
                }
            }
        }

        currNodes = new ArrayList<Node>(res);
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_equal(XpathParser.Filter_equalContext ctx) {
        System.out.println("visitFilter_eq");
//        printNodeList(currNodes);

        ArrayList<Node> prevNodes = currNodes;
        HashSet<Node> res = new HashSet<Node>();

        for (Node n : prevNodes) {
            ArrayList<Node> tmp = new ArrayList<Node>();
            tmp.add(n);
            currNodes = tmp;
//            System.out.println("visiting left...");
            ArrayList<Node> left = visit(ctx.rp(0));
            currNodes = tmp;
//            System.out.println("visiting right...");
            ArrayList<Node> right = visit(ctx.rp(1));
//            System.out.println("back to filter_eq");
//            System.out.println(left.size());
//            System.out.println(right.size());
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
        System.out.println("in visitFilter_or()");

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
        System.out.println("in visitFilter_not()");

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


    //===================helper methods=============================
    private void printNodeList(ArrayList<Node> nodes) {
//        System.out.println("=========printing all current nodes===========");
//        for (Node n : nodes) {
//            System.out.println(n.getNodeName());
//        }
//        System.out.println("=========done===========");
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