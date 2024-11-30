package Day77GraphLivePractice;
import java.util.*;

public class HasPath {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public boolean hasPath(ArrayList<Integer>[] adj, int src, int dest, boolean[] vis) {
        if (src == dest) {
            return true;
        }
        vis[src] = true;
        for (int nbr : adj[src]) {
            if (vis[nbr]) { // Check the neighbor, not the source
                continue;
            }
            if (hasPath(adj, nbr, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        Edge[] edges = new Edge[]{
            new Edge(0, 1, -1),
            new Edge(0, 2, 4),
            new Edge(1, 2, 2),
            new Edge(1, 3, 5),
            new Edge(2, 3, 1),
            new Edge(3, 0, 3),
            new Edge(3, 1, 1),
            new Edge(3, 2, 8),
            new Edge(2, 0, 2),
            new Edge(0, 3, 7)
        };

        // Create adjacency list
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (Edge edge : edges) {
            adj[edge.src].add(edge.dest);
        }

        HasPath hp = new HasPath(); // Create an instance of HasPath
        boolean[] visited = new boolean[V];
        System.out.println(hp.hasPath(adj, 0, 3, visited)); // Call hasPath on the instance
    }
}