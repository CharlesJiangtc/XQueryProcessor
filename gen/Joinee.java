import java.util.*;

public class Joinee {
    ArrayList<String> vars;
    ArrayList<String> fors;
    ArrayList<String> wheres;
    HashSet<Integer> targets;
    HashMap<Integer, ArrayList<String>> joinList;

    public Joinee() {
        vars = new ArrayList<>();
        fors = new ArrayList<>();
        wheres = new ArrayList<>();
        targets = new HashSet<>();
        joinList = new HashMap<>();
    }

    public String generateFLWR() {
        String flwr = "for ";
        for (int i = 0; i < fors.size(); i++) {
            flwr += fors.get(i);
            if (i < fors.size()-1) {
                flwr += ", ";
            }
        }
        if (wheres.size() > 0) {
            flwr += " where ";
            for (int j = 0; j < wheres.size(); j++) {
                flwr += wheres.get(j);
                if (j < wheres.size()-1) {
                    flwr += " and ";
                }
            }
        }
        flwr += " return <tuple> {";
        for (int k = 0; k < vars.size(); k++) {
            String varName = vars.get(k).substring(1);
            flwr += "<" + varName + ">{" + vars.get(k) + "}</" + varName + ">";
            if (k < vars.size()-1) {
                flwr += ", ";
            }
        }
        flwr += "} </tuple> ";
        return flwr;
    }
}