import java.util.*;
import java.util.LinkedList;

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

        public Edge(int destination){
            this.destination = destination;
        }

        public Edge(int destination, int weight){
            this.destination = destination;
            this.weight = weight;
        }
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

    public void breadthFirstSearch(int startVertex, boolean[] visited){
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


    public void depthFirstSearch(int startVertex, boolean[] visited){
        Stack<Integer> stack = new Stack<>();

        visited[startVertex] = true;
        stack.push(startVertex);

        while(!stack.isEmpty()){
            int currentVertex = stack.pop();
            System.out.print(currentVertex + " ");

            List<Edge> neighbors = adjacencyList.get(currentVertex);
            for (Edge neighbor: neighbors) {
                int destination = neighbor.destination;
                if (!visited[destination]){
                    visited[destination] = true;
                    stack.push(destination);
                }
            }
        }
        System.out.println();
    }
}
class GraphMain {
    public static void main(String[] args) {
        int numVertices = 8;
        Graph graphW = new Graph(numVertices);
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

        graph.printGraph();
        System.out.println();

        graphW.addEdgeW(0, 1, 2);
        graphW.addEdgeW(0, 4, 5);
        graphW.addEdgeW(1, 2, 3);
        graphW.addEdgeW(1, 3, 1);
        graphW.addEdgeW(1, 4, 4);
        graphW.addEdgeW(2, 3, 2);
        graphW.addEdgeW(3, 4, 1);
        // add disconnect graphW
        graphW.addEdgeW(5, 6, 2);
        graphW.addEdgeW(6, 7, 1000);

        graphW.printGraph();
        System.out.println();
        boolean[] visited = new boolean[numVertices];
        for (int i = 0; i < numVertices; i++){
            if(!visited[i]){
                System.out.print("BFS Traversal starting from vertex: " + i + ": ");
                graphW.breadthFirstSearch(i, visited);
            }
        }
        System.out.println();
        visited = new boolean[numVertices];
        for(int i = 0; i < numVertices; i++){
            if(!visited[i]){
                System.out.print("DFS Traversal starting from vertex: " + i + ": ");
                graphW.depthFirstSearch(i, visited);
            }
        }
    }
}