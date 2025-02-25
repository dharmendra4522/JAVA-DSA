package Day82GhaphPart4;

import java.util.ArrayList;

public class BellmanFordAlgo {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int dest, int wt) {
            this.src = s;
            this.dest = dest;
            this.wt = wt;
        }

        static void createGraph(ArrayList<Edge>[] graph) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));

            graph[1].add(new Edge(1, 2, -4));

            graph[2].add(new Edge(2, 3, 2));

            graph[3].add(new Edge(3, 4, 4));

            graph[4].add(new Edge(4, 1, -1));

        }

        public static void bellmanFord(ArrayList<Edge>[] graph, int src) {
            int dist[] = new int[graph.length];
            for (int i = 0; i < dist.length; i++) {
                if (i != src) {
                    dist[i] = Integer.MAX_VALUE;
                }

            }
            int V = graph.length;
            //algo --O(V)
            for(int i=0; i<V-1; i++){
                //edge --O(E)
                for(int j=0; j<graph.length; j++){
                    for(int k=0; k<graph[j].size(); k++){
                        Edge e = graph[j].get(k);
                        // u, v w
                        int u = e.src;
                        int v = e.dest;
                        int wt = e.wt;
                        //relaxation
                        if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                            dist[v] = dist[u] + wt;
                        }
                    }
                }
            }
            //print 
            for(int i=0; i<dist.length; i++){
                System.out.println("Vertex " + i + " shortest distance is " + dist[i]);
            }
            System.out.println();
        }
        public static void main(String[] args) {
            ArrayList<Edge>[] graph = new ArrayList[5];
            //create graph
            createGraph(graph);
            //bellman ford
            bellmanFord(graph, 0);

        }
    }

}
