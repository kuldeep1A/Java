package src;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch extends Graph {

    public BreadthFirstSearch(int numVertices) {
        super(numVertices);
    }

    public void BFS(int startVertex){
        boolean[] visited = new boolean[getNumVertices()];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while(!queue.isEmpty()){
            int current_vertex = queue.poll();
            System.out.print(current_vertex + " ");
            List<Edge> neighbors = getAdjacencyList().get(current_vertex);
            for (Edge neighbor: neighbors){
                int destination = neighbor.destination;
                if (!visited[destination]){
                    visited[destination] = true;
                    queue.add(destination);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BreadthFirstSearch graph = new BreadthFirstSearch(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

        graph.printGraph();
        graph.BFS(0);
    }
}
