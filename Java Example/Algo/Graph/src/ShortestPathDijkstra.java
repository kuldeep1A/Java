package src;

import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathDijkstra extends Graph {
    public ShortestPathDijkstra(int vertices){
        super(vertices);
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int dest;
        public Pair(int node, int dest){
            this.node = node;
            this.dest = dest;
        }

        @Override
        public int compareTo(Pair other){
            return Integer.compare(this.dest, other.dest);
        }
    }

    public static void Dijkstra(Graph graph, int source){
        Pair node = new Pair(0, 0);
        PriorityQueue<Pair> pair = new PriorityQueue<>();
        pair.add(node);
    }
    public static void main(String[] args) {
        ShortestPathDijkstra graph = new ShortestPathDijkstra(9);
        graph.addEdgeUW(0, 1, 4);
        graph.addEdgeUW(0, 7, 8);
        graph.addEdgeUW(1, 2, 8);
        graph.addEdgeUW(1, 7, 11);
        graph.addEdgeUW(2, 3, 7);
        graph.addEdgeUW(2, 5, 4);
        graph.addEdgeUW(2, 8, 2);
        graph.addEdgeUW(3, 4, 9);
        graph.addEdgeUW(3, 5, 14);
        graph.addEdgeUW(4, 5, 10);
        graph.addEdgeUW(5, 6, 2);
        graph.addEdgeUW(6, 8, 6);
        graph.addEdgeUW(6, 7, 1);
        graph.addEdgeUW(7, 8, 7);

        graph.printGraph();

//        List<Integer> res = Dijkstra(graph, 0);
//        System.out.println(res);
    }
}
