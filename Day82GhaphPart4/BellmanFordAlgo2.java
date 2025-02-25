package Day82GhaphPart4;

import java.util.ArrayList;

public class BellmanFordAlgo2 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int dest, int wt) {
            this.src = s;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Graph creation using edge list
    static void createGraph2(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];

        // Initialize distances
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0; // Source vertex distance is 0

        // Relaxation phase
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                // Relaxation condition
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        // Check for negative weight cycle
        for (int j = 0; j < graph.size(); j++) {
            Edge e = graph.get(j);
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;

            if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                System.out.println("Graph contains a negative weight cycle");
                return;
            }
        }

        // Print shortest distances
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Vertex " + i + " shortest distance is " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph2(edges);
        bellmanFord(edges, 0, V);
    }
}
