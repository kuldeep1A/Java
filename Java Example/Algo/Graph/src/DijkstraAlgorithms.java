package src;
import java.util.*;

public class DijkstraAlgorithms {
    private static final Map<String, Map<String, Integer>> graph = new HashMap<>();
    static class Node {
        String name;
        int distance;
        Node(String name, int distance){
            this.name = name;
            this.distance = distance;
        }
    }

    public static void addEdge(String source, String destination, int weight){
        if (!graph.containsKey(source)){
            graph.put(source, new HashMap<>());
        }
        graph.get(source).put(destination, weight);
    }

    public static Map<String, Integer> Dijsktra(String startNode){
        PriorityQueue<Node> PriorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        Map<String, Integer> distance = new HashMap<>();
        Set<String> visited = new HashSet<>();

        for (String node: graph.keySet()){
            distance.put(node, Integer.MAX_VALUE);
        }
        distance.put("E", Integer.MAX_VALUE);

        distance.put(startNode, 0);

        PriorityQueue.add(new Node(startNode, 0));

        while (!PriorityQueue.isEmpty()){
            Node currentNode = PriorityQueue.poll();
            String current = currentNode.name;

            // Skip if the node has already been visited
            if (visited.contains(current)){
                continue;
            }

            visited.add(current);

            // Visit each neighbor of the current node
            Map<String, Integer> neighbors = graph.get(current);
            if (neighbors != null){
                for (Map.Entry<String, Integer> neighbor: neighbors.entrySet()){
                    String neighborName = neighbor.getKey();
                    int neighborDistance = neighbor.getValue();

                    int newDistance = distance.get(current) + neighborDistance;

                    if (newDistance < distance.get(neighborName)){
                        distance.put(neighborName, newDistance);
                        PriorityQueue.add(new Node(neighborName, newDistance));
                    }
                }
            }
        }
        return distance;
    }


    public static void main(String[] args) {
        // Add edges to the graph
        addEdge("A", "B", 5);
        addEdge("A", "C", 2);
        addEdge("B", "C", 1);
        addEdge("B", "D", 3);
        addEdge("C", "D", 2);
        addEdge("D", "E", 4);

        String startNode = "A";
        Map<String, Integer> shortestDistance = Dijsktra(startNode);

        // Print the shortest distances from the start node to all other nodes
        for (Map.Entry<String, Integer> entry: shortestDistance.entrySet()){
            String node = entry.getKey();
            int distance = entry.getValue();

            System.out.println("Shortest distance from " + startNode + " to " + node + ": " + distance);
        }
    }

}
