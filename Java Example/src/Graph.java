import java.util.ArrayList;
// Graph Using ArrayList
public class Graph {
    static class Edge{
        int src;
        int dest;
        int wet;

        public Edge(int src, int dest, int wet){
            this.src = src;
            this.dest = dest;
            this.wet = wet;
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest, int wet){
        graph[src].add(new Edge(src, dest, wet));
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        addEdge(graph, 0, 2, 2);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 1, 3, 0);
        addEdge(graph, 2, 0, 2);
        addEdge(graph, 2, 1, 10);
        addEdge(graph, 2, 3, -1);
        addEdge(graph, 3, 1, 0);
        addEdge(graph, 3, 2, -1);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // print 2's neighbour
        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest + ", " + e.wet);
        }
    }
}
