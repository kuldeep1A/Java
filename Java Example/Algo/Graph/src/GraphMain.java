package src;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph{
    private final int numVertices;
    private final List<List<Edge>> adjacencyList;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);

        for(int i = 0; i < numVertices; i++){
            adjacencyList.add(new ArrayList<>());
        }
    }

    static class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight){
            this.destination = destination;
            this.weight = weight;
        }
    }

    public void addEdge(int source, int destination, int weight){
        Edge edge = new Edge(destination, weight);
        adjacencyList.get(source).add(edge);
    }

    public void printGraph(){
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Edge edge: adjacencyList.get(i)){
                System.out.print("(" + edge.destination + "d" + ", " + edge.weight + "w" + ") ");
            }
            System.out.println();
        }
    }

    public void breadthFirstSearch(int startVertex){
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            List<Edge> neighbors = adjacencyList.get(currentVertex);
            for(Edge neighbor: neighbors){
                int destination = neighbor.destination;
                if(!visited[destination]){
                    visited[destination] = true;
                    queue.add(destination);
                }
            }
        }
        System.out.println();
    }

    public void Traversal(){
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]){
                System.out.println("BFS travkersal starting from vertex " + i + ": ");
                breadthFirstSearch(i);
                System.out.println();
            }
        }
    }
}
public class GraphMain {
    public static void main(String[] args) {
        int numVertices = 8;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 4, 5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 1);
        graph.addEdge(1, 4, 4);
        graph.addEdge(2, 3, 2);
        graph.addEdge(3, 4, 1);
        // add disconnect graph
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1000);

        graph.printGraph();

        graph.Traversal();
    }
}