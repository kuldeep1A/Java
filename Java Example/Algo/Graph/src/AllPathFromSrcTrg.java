package src;

import java.util.ArrayList;
import java.util.List;

public class AllPathFromSrcTrg extends Graph {
    public AllPathFromSrcTrg(int numVertices) {
        super(numVertices);
    }

    public static List<List<Integer>> allPath(AllPathFromSrcTrg graph, int current, int target){
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> visited = new ArrayList<>();
        dfs_helper(graph, visited, current, target, paths);
        return paths;
    }

    private static void dfs_helper(AllPathFromSrcTrg graph, List<Integer> visited, int current, int target, List<List<Integer>> paths){
        visited.add(current);
        if (current == target){
            paths.add(new ArrayList<>(visited));
        } else {
            List<Edge> neighbors = graph.getAdjacencyList().get(current);
            for (Edge neighbor: neighbors){
                int destination = neighbor.destination;
                if (!visited.contains(destination)){
                    dfs_helper(graph, visited, destination, target, paths);
                }
            }
        }
        visited.remove(visited.size() - 1);
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
        List<List<Integer>> paths = graph.allPath(graph, 0, 5);
        System.out.println(paths);

    }
}
