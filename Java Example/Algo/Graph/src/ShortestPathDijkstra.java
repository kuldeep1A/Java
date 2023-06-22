package src;

import java.util.Arrays;
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
            return this.dest - other.dest;
        }
    }

    public static int[] Dijkstra(Graph graph, int parent){
        PriorityQueue<Pair> pairPQ = new PriorityQueue<>();
        int[] distance = new int[graph.getNumVertices()];
        boolean[] visited = new boolean[graph.getNumVertices()];
        for (int i = 0; i < graph.getNumVertices(); i++){
            if (i != parent){
                distance[i] = Integer.MAX_VALUE;
            }
        }

        // first source (parent)  distance is always zero
        pairPQ.add(new Pair(0, 0));

        while (!pairPQ.isEmpty()){
            Pair current = pairPQ.remove();
            if (!visited[current.node]){
                visited[current.node] = true;
                List<Edge> neighbors = graph.getAdjacencyList().get(current.node);
                for (Edge neighbor: neighbors){
                    int source = neighbor.source;    // u
                    int destination = neighbor.destination;   // v
                    int weight = neighbor.weight;    //w

                    // performs relaxation
                    if (distance[source] + weight < distance[destination]){
                        distance[destination] = distance[source] + weight;
                        pairPQ.add(new Pair(destination, distance[destination]));
                    }
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        ShortestPathDijkstra graph = new ShortestPathDijkstra(9);
//        https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
        graph.addEdgeUSW(0, 1, 4);
        graph.addEdgeUSW(0, 7, 8);
        graph.addEdgeUSW(1, 2, 8);
        graph.addEdgeUSW(1, 7, 11);
        graph.addEdgeUSW(2, 3, 7);
        graph.addEdgeUSW(2, 5, 4);
        graph.addEdgeUSW(2, 8, 2);
        graph.addEdgeUSW(3, 4, 9);
        graph.addEdgeUSW(3, 5, 14);
        graph.addEdgeUSW(4, 5, 10);
        graph.addEdgeUSW(5, 6, 2);
        graph.addEdgeUSW(6, 8, 6);
        graph.addEdgeUSW(6, 7, 1);
        graph.addEdgeUSW(7, 8, 7);

        ShortestPathDijkstra graph2 = new ShortestPathDijkstra(6);
        graph2.addEdgeSW(0, 1, 2);
        graph2.addEdgeSW(0, 2, 4);
        graph2.addEdgeSW(1, 2, 1);
        graph2.addEdgeSW(1, 3, 7);
        graph2.addEdgeSW(2, 4, 3);
        graph2.addEdgeSW(3, 5, 1);
        graph2.addEdgeSW(4, 3, 2);
        graph2.addEdgeSW(4, 5, 5);

        graph.printGraph();


        int[] res = Dijkstra(graph, 0);
        System.out.println("graph1: " + Arrays.toString(res));
        System.out.println("\n\n");

        graph2.printGraph();

        res = Dijkstra(graph2,0);
        System.out.println("graph2: " + Arrays.toString(res));
    }
}
