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
        currNodes.addAll(getAll(getAll(currNodes)));

//        printNodeList(currNodes);

        return visit(ctx.rp());
    }


    @Override public ArrayList<Node> visitDoc(XpathParser.DocContext ctx) {
        System.out.println("in visitDoc()");

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

        for (Node n : getChildren(currNodes)) {
            System.out.println(n.getNodeType());
            if (n.getNodeType() == textNodeTypeCode) {
                currNodes.add(n);
                System.out.println("text Node" + n.getNodeValue());
            }
        }

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_attName(XpathParser.Rp_attNameContext ctx) {
        System.out.println("in visitRp_txt()");

        for (Node n : getChildren(currNodes)) {
            System.out.println(n.getNodeType());
            if (n.getNodeType() == attrNodeTypeCode) {
                currNodes.add(n);
                System.out.println("attr Node" + n.getNodeValue());
            }
        }
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
        System.out.println("in visitRp_children()");

        currNodes.addAll(getChildren(currNodes));
        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_tagName(XpathParser.Rp_tagNameContext ctx) {
        System.out.println("in visitRp_tagName()");
        System.out.println(ctx.getText());

        ArrayList<Node> res = new ArrayList<Node>();

        for (Node n : getChildren(currNodes)) {
            if (n.getNodeType() == elementNodeTypeCode && n.getNodeName().equals(ctx.getText())) {
                res.add(n);
            }
        }

        currNodes = res;
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
        System.out.println("in visitRp_filter()");

        currNodes = visit(ctx.filter());

        return currNodes;
    }


    @Override public ArrayList<Node> visitRp_all(XpathParser.Rp_allContext ctx) {
        System.out.println("in visitRp_all()");

        currNodes = getAll(currNodes);
        return currNodes;
    }


    @Override public ArrayList<Node> visitFilter_rp(XpathParser.Filter_rpContext ctx) {
        System.out.println("in visitFilter_rp()");

        //undone
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
            System.out.println("visiting left...");
            ArrayList<Node> left = visit(ctx.rp(0));
            currNodes = tmp;
            System.out.println("visiting right...");
            ArrayList<Node> right = visit(ctx.rp(1));
            System.out.println("back to filter_eq");
            System.out.println(left.size());
            System.out.println(right.size());
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


    @Override public ArrayList<Node> visitFilter_equal(XpathParser.Filter_equalContext ctx) {
        System.out.println("visitFilter_eq");

        ArrayList<Node> prevNodes = currNodes;
        ArrayList<Node> res = new ArrayList<Node>();

        for (Node n : prevNodes) {
            ArrayList<Node> tmp = new ArrayList<Node>();
            tmp.add(n);
            currNodes = tmp;
            System.out.println("visiting left...");
            ArrayList<Node> left = visit(ctx.rp(0));
            currNodes = tmp;
            System.out.println("visiting right...");
            ArrayList<Node> right = visit(ctx.rp(1));
            System.out.println("back to filter_eq");
            System.out.println(left.size());
            System.out.println(right.size());
            for (Node l : left) {
                for (Node r : right) {
                    if (l.isEqualNode(r)) {
                        res.add(n);
                    }
                }
            }
        }

        currNodes = res;
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