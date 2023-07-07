package src;

import java.util.HashMap;

public class findPathFromTickets {
    public static String _findPathFromTickets(HashMap<String, String> Tickets){
        String start = "";
        for (String source: Tickets.keySet()){
            if (!Tickets.containsValue(source)){
                start = source;
                break;
            }
        }
        StringBuilder path = new StringBuilder();
        while (Tickets.containsKey(start)){
            path.append(start).append("->");
            start = Tickets.get(start);
            if (!Tickets.containsKey(start)){
                path.append(start);
            }
        }
        return path.toString();
    }
    public static void main(String[] args) {
        HashMap<String, String> Tickets = new HashMap<>();
        Tickets.put("Chennai", "Bengaluru");
        Tickets.put("Mumbai", "Delhi");
        Tickets.put("Goa", "Chennai");
        Tickets.put("Delhi", "Goa");

        String path = _findPathFromTickets(Tickets);
        System.out.println(path);

    }
}
