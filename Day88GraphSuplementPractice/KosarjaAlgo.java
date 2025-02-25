import java.util.*;

public class KosarjaAlgo {

    public static void addEdge(ArrayList<Integer>[] graph, int u, int v) {
        graph[u].add(v);
    }

    public static void main(String[] args) {
        int N = 9;
        ArrayList<Integer>[] graph = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 7);
        addEdge(graph, 7, 6);
        addEdge(graph, 7, 8);
        addEdge(graph, 6, 8);
        addEdge(graph, 6, 5);
        addEdge(graph, 5, 4);

        for (int i = 0; i < N; i++) {
            System.out.println(i + "->" + graph[i]);
        }

    }

}