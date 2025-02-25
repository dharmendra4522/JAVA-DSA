package Day81GraphPracticeQs;

import java.util.*;

public class Ques1 {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // BFS to detect a cycle
    static boolean bfs(int src, ArrayList<Edge>[] graph, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        int[] parent = new int[graph.length];
        Arrays.fill(parent, -1); // Initialize parent array

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (vis[curr]) return true;
            vis[curr] = true;

            for (Edge e : graph[curr]) {
                if (!vis[e.dest]) {
                    q.add(e.dest);
                    parent[e.dest] = curr; // Set parent
                } else if (parent[curr] != e.dest) {
                    return true; // Cycle found
                }
            }
        }
        return false;
    }

    // Function to check if the graph contains a cycle
    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for (int src = 0; src < graph.length; src++) {
            if (!vis[src]) {
                if (bfs(src, graph, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Function to create a sample graph
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Add edges to the graph
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0)); // Undirected graph, add both directions

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));

        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));

        graph[4].add(new Edge(4, 1)); // Adding a back edge to create a cycle
        graph[1].add(new Edge(1, 4));
    }

    // Main function
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        if (isCycle(graph)) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}
