package src;
import java.util.ArrayList;
import java.util.List;

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

    public static class Edge{
        private final int destination;
        private final int weight;

        public Edge(int destination, int weight){
            this.destination = destination;
            this.weight = weight;
        }

        public int getDestination(){
            return this.destination;
        }

        public int getWeight(){
            return this.weight;
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
                System.out.print("(" + edge.getDestination() + "d" + ", " + edge.getWeight() + "w" + ") ");
            }
            System.out.println();
        }
    }
}
public class GraphMain {
    public static void main(String[] args) {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 4, 5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 1);
        graph.addEdge(1, 4, 4);
        graph.addEdge(2, 3, 2);
        graph.addEdge(3, 4, 1);

        graph.printGraph();
    }
}