package Day76GraphsParte1;

import java.util.ArrayList;

public class HashPath {
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

    // Create the graph
    public void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // Method to check if a path exists between src and dest
    public static boolean hashPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
        if (src == dest) {
            return true;
        }

        visited[src] = true; // Mark the current node as visited

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            // If the neighbor is not visited and a path exists from neighbor to dest
            if (!visited[e.dest] && hashPath(graph, e.dest, dest, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 7; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        HashPath hp = new HashPath();
        hp.createGraph(graph); // Initialize the graph

        int src = 0; // Source node
        int dest = 5; // Destination node

        boolean[] visited = new boolean[V]; // Visited array

        if (hashPath(graph, src, dest, visited)) {
            System.out.println("Path exists between " + src + " and " + dest);
        } else {
            System.out.println("No path exists between " + src + " and " + dest);
        }
    }
}
