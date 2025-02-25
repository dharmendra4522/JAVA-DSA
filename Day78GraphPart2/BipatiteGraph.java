package Day78GraphPart2;

import java.util.*;

public class BipatiteGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        // Step 1: Initialize a color array to keep track of colors assigned to nodes.
        // -1 indicates no color has been assigned initially.
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1; // No color assigned yet
        }

        // Step 2: Create a queue to perform BFS.
        Queue<Integer> q = new LinkedList<>();

        // Step 3: Traverse all nodes in the graph to ensure all components are checked.
        for (int i = 0; i < graph.length; i++) {
            // If the current node is not colored, start BFS from it.
            if (col[i] == -1) {
                q.add(i); // Add the node to the queue
                col[i] = 0; // Assign the first color (e.g., 0) to the node

                // Perform BFS to color the graph
                while (!q.isEmpty()) {
                    int curr = q.remove(); // Get the current node from the queue

                    // Step 4: Traverse all neighbors of the current node
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j); // Get the edge (neighbor node)

                        // If the neighbor (destination node) is not colored:
                        if (col[e.dest] == -1) {
                            // Assign the opposite color to the neighbor
                            int nextCol = (col[curr] == 0) ? 1 : 0;
                            col[e.dest] = nextCol;

                            // Add the neighbor to the queue for further processing
                            q.add(e.dest);
                        }
                        // If the neighbor is already colored and has the same color as the current
                        // node:
                        else if (col[e.dest] == col[curr]) {
                            // The graph is NOT bipartite, as adjacent nodes have the same color
                            return false;
                        }
                    }
                }
            }
        }
        // If BFS completes without finding adjacent nodes with the same color, the
        // graph is bipartite.
        return true;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));

    }
}
