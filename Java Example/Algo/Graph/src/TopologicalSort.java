package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort extends Graph {
    public TopologicalSort(int vertices){
        super(vertices);
    }
    private static void dfs_helper(Graph graph, int current, boolean[] visited, Stack<Integer> stack){
        visited[current] = true;

        List<Edge> neighbors = graph.getAdjacencyList().get(current);
        for (Edge neighbor: neighbors){
            if(!visited[neighbor.destination]){
                dfs_helper(graph, neighbor.destination, visited, stack);
            }
        }
        stack.push(current);
    }
    public static List<Integer> topoSort(Graph graph){
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.getNumVertices()];
        for (int i = 0; i < graph.getNumVertices(); i++){
            if (!visited[i]){
                dfs_helper(graph, i, visited, stack);
            }
        }
        for (int i = 0; i < graph.getNumVertices(); i++){
            result.add(stack.pop());
        }
        return result;
    }
    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(6);
        graph.addEdge(5, 0);
        graph.addEdge(5, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);

        graph.printGraph();

        List<Integer> result = topoSort(graph);
        System.out.println(result);
    }
}
