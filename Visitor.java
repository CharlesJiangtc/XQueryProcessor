
import java.io.IOException;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

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
    Document doc = null;
    boolean rm = false;

    public ArrayList<Node> removeDup(ArrayList<Node> temp){
        for(Iterator<Node> itr = temp.iterator(); itr.hasNext();){
            Node t = itr.next();
            for(int i=(temp.indexOf(t)+1); i<temp.size(); i++){
                if(t.isSameNode(temp.get(i))){
                    itr.remove();
                    break;
                }
            }
        }
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitDoc(XpathParser.DocContext ctx){
        File DOMtree = new File(ctx.filename().getText());
        //String filename = ctx.filename().getText();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            doc = db.parse(DOMtree);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        ArrayList<Node> a = new ArrayList<>();
        descendant.add(doc);
        a.add(doc);
        System.out.println("read doc finish");
        return a;
    }

    //done
    @Override
    public ArrayList<Node> visitAp_children(XpathParser.Ap_childrenContext ctx) {
        visit(ctx.doc());
        /*ArrayList<Node> temp = new ArrayList<>();
        int num = descendant.get(0).getChildNodes().getLength();
        for (int i = 0; i < num; i++) {
            if(descendant.get(0).getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE) {
                temp.add(descendant.get(0).getChildNodes().item(i));
            }
        }
        temp = removeDup(temp);
        descendant=temp;*/
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
            if(descendant.get(0).getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE) {
                temp.add(descendant.get(0).getChildNodes().item(i));
            }
        }
        descendant.addAll(temp);
        all = true;
        System.out.println("ap all finish");
        return visit(ctx.rp());
    }

    //done
    @Override
    public ArrayList<Node> visitRp_tagName(XpathParser.Rp_tagNameContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        if(all){
            temp.addAll(descendant);
            temp = getAllnode(temp);
            temp.removeIf(t -> !t.getNodeName().equals(ctx.TAGNAME().getText()));
            if(rm){
                removeDup(temp);
                rm = false;
            }
            descendant = temp;
            all = false;
        }
        else {
            for (Node des : descendant) {
                if(des.getNodeType() == Node.DOCUMENT_NODE){
                    int num = descendant.get(0).getChildNodes().getLength();
                    for (int i = 0; i < num; i++) {
                        if(descendant.get(0).getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE) {
                            temp.add(descendant.get(0).getChildNodes().item(i));
                        }
                    }
                    continue;
                }
                int num = des.getChildNodes().getLength();
                for (int i = 0; i < num; i++) {
                    if (des.getChildNodes().item(i).getNodeName().equals(ctx.TAGNAME().getText())) {
                        temp.add(des.getChildNodes().item(i));
                    }
                }
            }
            if(rm){
                removeDup(temp);
                rm = false;
            }
            descendant = temp;
        }
        return temp;
    }

    public ArrayList<Node> getAllnode (ArrayList<Node> parent){
        ArrayList<Node> temp = new ArrayList<>();
        for (Node t : parent) {
            if(t.isSameNode(doc)){
                int num = descendant.get(0).getChildNodes().getLength();
                for (int i = 0; i < num; i++) {
                    if(descendant.get(0).getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE) {
                        temp.add(descendant.get(0).getChildNodes().item(i));
                    }
                }
                continue;
            }
            int num = t.getChildNodes().getLength();
            if(num == 0){
                continue;
            }
            for (int i = 0; i < num; i++){
                ArrayList<Node> children = new ArrayList<>();
                if(t.getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE) {
                    children.add(t.getChildNodes().item(i));
                    children.addAll(getAllnode(children));
                }
                temp.addAll(children);
            }
        }
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_descendant(XpathParser.Rp_descendantContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        if(all){
            temp.addAll(descendant);
            temp = getAllnode(temp);
            temp.removeIf(t -> !(t.getNodeType() == Node.ELEMENT_NODE));
            descendant = temp;
            if(rm){
                removeDup(temp);
                rm = false;
            }
            all = false;
        }
        else {
            for (Node des : descendant) {
                int num = des.getChildNodes().getLength();
                for (int i = 0; i < num; i++) {
                    if (des.getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE) {
                        temp.add(des.getChildNodes().item(i));
                    }
                }
            }
            if(rm){
                removeDup(temp);
                rm = false;
            }
            descendant = temp;
        }
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_sibling(XpathParser.Rp_siblingContext ctx) {
        if(rm){
            removeDup(descendant);
            rm = false;
        }
        System.out.println("rp sibling finish");
        return descendant;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_parent(XpathParser.Rp_parentContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for(Node des : descendant) {
            temp.add(des.getParentNode());
        }
        if(rm){
            removeDup(temp);
            rm = false;
        }
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_txt(XpathParser.Rp_txtContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for (Node des : descendant) {
            int num = des.getChildNodes().getLength();
            for(int i=0; i<num; i++) {
                if (des.getChildNodes().item(i).getNodeType() == Node.TEXT_NODE && !des.getChildNodes().item(i).getTextContent().equals("\n")) {
                    temp.add(des.getChildNodes().item(i));
                }
            }
        }
        if(rm){
            removeDup(temp);
            rm = false;
        }
        descendant = temp;
        System.out.println("rp txt finish");
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_attName(XpathParser.Rp_attNameContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for (Node des : descendant) {
            int num = des.getChildNodes().getLength();
            for(int i=0; i<num; i++) {
                if (des.getChildNodes().item(i).getNodeType() == Node.ATTRIBUTE_NODE && !des.getChildNodes().item(i).getTextContent().equals("\n")) {
                    temp.add(des.getChildNodes().item(i));
                }
            }
        }
        if(rm){
            removeDup(temp);
            rm = false;
        }
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_self(XpathParser.Rp_selfContext ctx) {
        if(rm){
            removeDup(descendant);
            rm = false;
        }
        System.out.println("rp self finish");
        return visit(ctx.rp());
    }

    //done
    @Override
    public ArrayList<Node> visitRp_children(XpathParser.Rp_childrenContext ctx) {
        visit(ctx.rp(0));
        if(rm){
            removeDup(descendant);
            rm = false;
        }
        rm = true;
        System.out.println("rp children finish");
        return visit(ctx.rp(1));
    }

    //done
    @Override
    public ArrayList<Node> visitRp_all(XpathParser.Rp_allContext ctx) {
        visit(ctx.rp(0));
        if(rm){
            removeDup(descendant);
            rm = false;
        }
        rm = true;
        all = true;
        System.out.println("rp all finish");
        return visit(ctx.rp(1));
    }

    //done
    @Override
    public ArrayList<Node> visitRp_filter(XpathParser.Rp_filterContext ctx) {
        visit(ctx.rp());
        ArrayList <Node> cur = descendant;
        ArrayList <Node> ret = new ArrayList<>();
        ArrayList<Node> temp = new ArrayList<>();
        for(Node res : cur){
            ArrayList<Node> curr = new ArrayList<>();
            curr.add(res);
            descendant = curr;
            ret = visit(ctx.filter());
            if(ret.size()!=0){
                temp.add(res);
            }
            else{
            }
        }
        if(rm){
            removeDup(temp);
            rm = false;
        }
        descendant = temp;
        System.out.println("rp filter finish");
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitRp_merge(XpathParser.Rp_mergeContext ctx) {
        ArrayList<Node> temp;
        result = descendant;
        ArrayList<Node> left = visit(ctx.rp(0));
        temp = descendant;
        descendant = result;
        ArrayList<Node> right = visit(ctx.rp(1));
        temp.addAll(descendant);
        if(rm){
            removeDup(temp);
            rm = false;
        }
        descendant = temp;
        System.out.println("rp merge finish");
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_rp(XpathParser.Filter_rpContext ctx) {
        ArrayList<Node> descendant2 = descendant;
        ArrayList<Node> temp = new ArrayList<>();
        ArrayList<Node> descendant1 = new ArrayList<>();
        for(Node res : descendant2){
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
        return temp;
    }

    //what if rp(1) is 'text'?
    @Override
    public ArrayList<Node> visitFilter_equal(XpathParser.Filter_equalContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        result = descendant;
        ArrayList<Node> left = visit(ctx.rp(0));
        descendant = result;
        ArrayList<Node> right = visit(ctx.rp(1));
        for (Node des1 : left) {
            for (Node des : right) {
                if (des1.isEqualNode(des)) {
                    temp.add(des1);
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
        result = descendant;
        ArrayList<Node> left = visit(ctx.rp(0));
        descendant = result;
        ArrayList<Node> right = visit(ctx.rp(1));
        for (Node des1 : left) {
            for (Node des : right) {
                if (des1.isSameNode(des)) {
                    temp.add(des1);
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

    @Override
    public ArrayList<Node> visitFilter_txt(XpathParser.Filter_txtContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        visit(ctx.rp());
        String txt;
        txt = ctx.STRING().getText();
        String str = txt.substring(1,(txt.length()-1));

        for(Node des : descendant){
            if(des.getNodeType() == Node.TEXT_NODE && des.getTextContent().equals(str)){
                temp.add(des);
            }
            else if(des.getNodeType() == Node.ATTRIBUTE_NODE && des.getTextContent().equals(str)){
                temp.add(des);
            }
        }
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_and(XpathParser.Filter_andContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        result = descendant;
        ArrayList<Node> left = visit(ctx.filter(0));
        descendant = result;
        ArrayList<Node> right = visit(ctx.filter(1));
        if(left.size()!=0 && right.size()!=0){
            temp.addAll(right);
            temp.addAll(left);
        }
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_or(XpathParser.Filter_orContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        result = descendant;
        ArrayList<Node> left = visit(ctx.filter(0));
        descendant = result;
        ArrayList<Node> right = visit(ctx.filter(1));
        if(left.size()!=0 || right.size()!=0){
            temp.addAll(right);
            temp.addAll(left);
        }
        descendant = temp;
        return temp;
    }

    //done
    @Override
    public ArrayList<Node> visitFilter_not(XpathParser.Filter_notContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        ArrayList<Node> mid;
        result = descendant;
        mid = visit(ctx.filter());
        if(mid.size() == 0){
            descendant = result;
            temp = result;
        }
        return temp;
    }
}