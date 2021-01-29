package ms1;

import java.io.IOException;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.*;

import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Entity;


public class Visitor extends XpathBaseVisitor<ArrayList<Node>> {
    ArrayList<Node> result = new ArrayList<>();
    ArrayList<Node> descendant = new ArrayList<>();
    ArrayList<Node> allnode = new ArrayList<>();
    boolean all = false;

    //done
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

    //done
    @Override
    public ArrayList<Node> visitAp_children(XpathParser.Ap_childrenContext ctx) {
        visit(ctx.doc());
        ArrayList<Node> temp = new ArrayList<>();
        int num = descendant.get(0).getChildNodes().getLength();
        for (int i = 0; i < num; i++) {
            if (descendant.get(0).getChildNodes().item(i).getNodeName() == ctx.getText()) {
                temp.add(descendant.get(0).getChildNodes().item(i));
            }
        }
        descendant = temp;
        all = false;
        return visit(ctx.rp());
    }

    //done
    @Override
    public ArrayList<Node> visitAp_all(XpathParser.Ap_allContext ctx) {
        visit(ctx.doc());
        ArrayList<Node> temp = new ArrayList<>();
        int num = descendant.get(0).getChildNodes().getLength();
        for (int i = 0; i < num; i++) {
            if (descendant.get(0).getChildNodes().item(i).getNodeName() == ctx.getText()) {
                temp.add(descendant.get(0).getChildNodes().item(i));
            }
        }
        descendant = temp;
        all = true;
        return visit(ctx.rp());
    }

    //done
    @Override
    public ArrayList<Node> visitRp_tagName(XpathParser.Rp_tagNameContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        if(all){
            temp = getAllnode(temp);
            allnode = temp;
            temp.removeIf(t -> !t.getNodeName().equals(ctx.getText()));
            descendant.addAll(temp);
            all = false;
        }
        else {
            for (Node des : descendant) {
                int num = des.getChildNodes().getLength();
                for (int i = 0; i < num; i++) {
                    if (des.getChildNodes().item(i).getNodeName().equals(ctx.getText())) {
                        temp.add(des.getChildNodes().item(i));
                    }
                }
            }
            descendant = temp;
        }
        return temp;
    }

    public ArrayList<Node> getAllnode (ArrayList<Node> temp){
        ArrayList<Node> cur = new ArrayList<>();
        for (Node t : temp) {
            int num = t.getChildNodes().getLength();
            if(num == 0){
                break;
            }
            for (int i = 0; i < num; i++){
                cur.add(t.getChildNodes().item(i));
                cur = getAllnode(cur);
                temp.addAll(cur);
            }
        }
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_descendant(XpathParser.Rp_descendantContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for(Node des : descendant){
            int num = des.getChildNodes().getLength();
            for (int i = 0; i < num; i++) {
                temp.add(des.getChildNodes().item(i));
            }
        }
        if(all){
            descendant.addAll(temp);
        }
        else {
            descendant = temp;
        }
        all = false;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_sibling(XpathParser.Rp_siblingContext ctx) {
        return descendant;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_parent(XpathParser.Rp_parentContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for(Node des : descendant) {
            temp.add(des.getParentNode());
        }
        if(all){
            descendant.addAll(temp);
        }
        else {
            descendant = temp;
        }
        all = false;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_txt(XpathParser.Rp_txtContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for (Node des : descendant) {
            int num = des.getChildNodes().getLength();
            for(int i=0; i<num; i++) {
                if (des.getChildNodes().item(i).getNodeType() == Node.TEXT_NODE) {
                    temp.add(des);
                }
            }
        }
        if(all){
            descendant.addAll(temp);
        }
        else {
            descendant = temp;
        }
        all = false;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_attName(XpathParser.Rp_attNameContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for (Node des : descendant) {
            Element desc = (Element) des;
            if (desc.getAttribute(ctx.NAME().getText()) != null) {
                temp.add(des);
            }
        }
        if(all){
            descendant.addAll(temp);
        }
        else {
            descendant = temp;
        }
        all = false;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_self(XpathParser.Rp_selfContext ctx) {
        return visit(ctx.rp());
    }

    //done
    @Override
    public ArrayList<Node> visitRp_children(XpathParser.Rp_childrenContext ctx) {
        visit(ctx.rp(0));
        return visit(ctx.rp(1));
    }

    //done
    @Override
    public ArrayList<Node> visitRp_all(XpathParser.Rp_allContext ctx) {
        visit(ctx.rp(0));
        all = true;
        return visit(ctx.rp(1));
    }

    //done
    @Override
    public ArrayList<Node> visitRp_filter(XpathParser.Rp_filterContext ctx) {
        visit(ctx.rp());
        result = descendant;
        return visit(ctx.filter());
    }

    //done
    @Override
    public ArrayList<Node> visitRp_merge(XpathParser.Rp_mergeContext ctx) {
        ArrayList<Node> temp;
        visit(ctx.rp(0));
        temp = descendant;
        visit(ctx.rp(1));
        temp.addAll(descendant);
        if(all){
            descendant.addAll(temp);
        }
        else {
            descendant = temp;
        }
        all = false;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_rp(XpathParser.Filter_rpContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        ArrayList<Node> descendant1 = new ArrayList<>();
        for(Node res : result){
            descendant1.add(res);
            descendant = descendant1;
            visit(ctx.rp());
            descendant1.remove(res);
            if(!descendant.isEmpty()){
                temp.add(res);
            }
        }
        //result = temp;
        descendant = temp;
        return visitChildren(ctx);
    }

    //what if rp(1) is 'text'?
    @Override
    public ArrayList<Node> visitFilter_equal(XpathParser.Filter_equalContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        ArrayList<Node> descendant1;
        visit(ctx.rp(0));
        descendant1 = descendant;
        visit(ctx.rp(1));
        for(Node res : result) {
            for (Node des1 : descendant1) {
                for (Node des : descendant) {
                    if (des1.isEqualNode(des)) {
                        temp.add(res);
                    }
                }
            }
        }
        //result = temp;
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_is(XpathParser.Filter_isContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        ArrayList<Node> descendant1;
        visit(ctx.rp(0));
        descendant1 = descendant;
        visit(ctx.rp(1));
        for(Node res : result) {
            for (Node des1 : descendant1) {
                for (Node des : descendant) {
                    if (des1.isSameNode(des)) {
                        temp.add(res);
                    }
                }
            }
        }
        //result = temp;
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_parent(XpathParser.Filter_parentContext ctx) {
        return visit(ctx.filter());
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_and(XpathParser.Filter_andContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        ArrayList<Node> left = visit(ctx.filter(0));
        ArrayList<Node> right = visit(ctx.filter(1));
        for(Node r : right){
            for (Node l : left) {
                if(r.isSameNode(l)){
                    temp.add(r);
                    break;
                }
            }
        }
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_or(XpathParser.Filter_orContext ctx) {
        ArrayList<Node> left = visit(ctx.filter(0));
        ArrayList<Node> right = visit(ctx.filter(1));
        ArrayList<Node> temp = new ArrayList<>(left);
        int num = temp.size();
        for(Node r : right){
            temp.add(r);
            for (int i=0; i<num; i++){
                if(!r.isSameNode(temp.get(i))){
                    temp.remove(r);
                    break;
                }
            }
        }
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_not(XpathParser.Filter_notContext ctx) {
        ArrayList<Node> temp;
        temp = descendant;
        visit(ctx.filter());
        for(Node t : temp){
            for(Node des : descendant){
                if(t.isEqualNode(des)){
                    temp.remove(t);
                    break;
                }
            }
        }
        descendant = temp;
        return temp;
    }
}