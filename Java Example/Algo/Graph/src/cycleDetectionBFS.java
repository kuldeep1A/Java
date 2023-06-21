package src;

public class cycleDetectionBFS extends Graph {
    public cycleDetectionBFS(int vertices){
        super(vertices);
    }

    public static void main(String[] args) {
        cycleDetectionBFS graph = new cycleDetectionBFS(4);
    }
}
