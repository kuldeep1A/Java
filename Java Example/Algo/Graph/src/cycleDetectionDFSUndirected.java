package src;

import java.util.List;

public class cycleDetectionDFSUndirected extends Graph {
    public cycleDetectionDFSUndirected(int vertices){
        super(vertices);
    }

    private static boolean dfs_helper(Graph graph, boolean[] visited, int current, int parent){
        visited[current] = true;

        List<Edge> neighbors = graph.getAdjacencyList().get(current);
        for (Edge neighbor: neighbors){
            if (visited[neighbor.destination] && parent != neighbor.destination){
                return true;
            }
            else if (!visited[neighbor.destination]){
                if (dfs_helper(graph, visited, neighbor.destination, current)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(Graph graph, int current){
        boolean[] visited = new boolean[graph.getNumVertices()];
        return dfs_helper(graph, visited, current, -1);
    }
    public static void main(String[] args) {
        cycleDetectionDFSUndirected graph = new cycleDetectionDFSUndirected(6);
        graph.addEdgeU(0, 1);
        graph.addEdgeU(0, 4);
        graph.addEdgeU(1, 2);
        graph.addEdgeU(1, 4);
        graph.addEdgeU(2, 3);
        graph.addEdgeU(4, 5);

        graph.printGraph();

        boolean res = isCycle(graph, 0);
        System.out.println(res);
    }
}
