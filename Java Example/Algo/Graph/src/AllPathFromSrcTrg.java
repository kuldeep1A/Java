package src;

import java.util.ArrayList;
import java.util.List;

public class AllPathFromSrcTrg extends Graph {
    public AllPathFromSrcTrg(int numVertices) {
        super(numVertices);
    }

    private final List<List<Integer>> paths = new ArrayList<>();
    private void dfs(List<List<Edge>> graph, boolean[] visited, List<Integer> path, int current, int target){
        if (current == target){
            paths.add(path);
            return;
        }
        for (int i = 0; i < graph.get(current).size(); i++){
            Edge edge = graph.get(current).get(i);
            if (!visited[edge.destination]){
                visited[current] = true;
                path.add(edge.destination);
                dfs(graph, visited, path, edge.destination, target);
                visited[current] = false;
            }
        }
    }

    public List<List<Integer>> allPath(List<List<Edge>> graph, int current, int target){
        boolean[] visited = new boolean[graph.size()];
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, visited, path, current, target);
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
        List<List<Integer>> paths = graph.allPath(graph.getAdjacencyList(), 0, 5);
        for(List<Integer> path: paths){
            System.out.println(path);
        }
    }
}
