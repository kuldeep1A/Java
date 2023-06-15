package src;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch extends Graph{
    public DepthFirstSearch(int numVertices){
        super(numVertices);
    }
    public void DFS(int startVertex){
        boolean[] visited = new boolean[getNumVertices()];
        Stack<Integer> stack = new Stack<>();

        visited[startVertex] = true;
        stack.push(startVertex);
        while(!stack.isEmpty()){
            int current_vertex = stack.pop();
            System.out.print(current_vertex + " ");
            List<Edge> neighbors = getAdjacencyList().get(current_vertex);
            for (Edge neighbor: neighbors){
                int destination = neighbor.destination;
                if (!visited[destination]){
                    visited[destination] = true;
                    stack.push(destination);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DepthFirstSearch graph = new DepthFirstSearch(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

        graph.printGraph();
        graph.DFS(0);
    }
}
