package src;
import java.util.*;

public class GraphD{
    private final int numVertices;
    private final List<List<Edge>> adjacencyList;

    public GraphD(int numVertices){
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);

        for(int i = 0; i < numVertices; i++){
            adjacencyList.add(new ArrayList<>());
        }
    }

    static class Edge {
        int destination;
        int weight;

        public Edge(int destination){
            this.destination = destination;
        }

        public Edge(int destination, int weight){
            this.destination = destination;
            this.weight = weight;
        }
    }

    public int getNumVertices(){
        return numVertices;
    }

    public List<List<Edge>> getAdjacencyList() {
        return adjacencyList;
    }

    public void addEdgeW(int source, int destination, int weight){
        Edge edge = new Edge(destination, weight);
        adjacencyList.get(source).add(edge);
    }
    public void addEdge(int source, int destination){
        Edge edge = new Edge(destination);
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
}