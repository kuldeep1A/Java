package src;

import java.util.List;

public class cycleDetectionDFS extends Graph{
    public cycleDetectionDFS(int vertices){
        super(vertices);
    }

    private static boolean isCycleUtil(Graph graph, int vertex, boolean[] visited, boolean[] recursionStack){
        visited[vertex] = true;
        recursionStack[vertex] = true;

        List<Edge> neighbors = graph.getAdjacencyList().get(vertex);
        for (Edge neighbor: neighbors){
            if (recursionStack[neighbor.destination]){
                return true;
            } else if (!visited[neighbor.destination] && isCycleUtil(graph, neighbor.destination, visited, recursionStack)){
                return true;
            }
        }

        recursionStack[vertex] = false;
        return false;
    }
    public static boolean isCycle(Graph graph){
        boolean[] visited = new boolean[graph.getNumVertices()];
        boolean[] recursionStack = new boolean[graph.getNumVertices()];

        for (int i = 0; i < graph.getNumVertices(); i++){
            if (isCycleUtil(graph, i, visited, recursionStack)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        cycleDetectionDFS graph = new cycleDetectionDFS(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        boolean hasCycle = isCycle(graph);
        System.out.println(hasCycle);
    }
}
