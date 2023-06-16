package src;

import java.util.ArrayList;
import java.util.List;

public class AllPathFromSrcTrg extends Graph {
    public AllPathFromSrcTrg(int numVertices) {
        super(numVertices);
    }

    private final List<String> paths = new ArrayList<>();
    private void dfs(List<List<Edge>> graph, boolean[] visited, String path, int current, int target){
        if (current == target){
            paths.add(path);
            return;
        }
        for (int i = 0; i < graph.get(current).size(); i++){
            Edge edge = graph.get(current).get(i);
            if (!visited[edge.destination]){
                visited[current] = true;
                dfs(graph, visited, path + edge.destination, edge.destination, target);
                visited[current] = false;
            }
        }
    }

    public List<String> allPath(List<List<Edge>> graph, int current, int target){
        boolean[] visited = new boolean[graph.size()];
        dfs(graph, visited, "0", current, target);
        return paths;
    }

    public static void main(String[] args) {
        AllPathFromSrcTrg graph = new AllPathFromSrcTrg(7);
        graph.addEdgeU(0, 1);
        graph.addEdgeU(0, 2);
        graph.addEdgeU(1, 3);
        graph.addEdgeU(2, 4);
        graph.addEdgeU(3, 4);
        graph.addEdgeU(3, 5);
        graph.addEdgeU(4, 5);
        graph.addEdgeU(5, 6);

        graph.printGraph();
        List<String> paths = graph.allPath(graph.getAdjacencyList(), 0, 5);
        for(String path: paths){
            System.out.println(path);
        }
    }
}
