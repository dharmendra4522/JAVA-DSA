package Day76GraphsParte1;
import java.util.*;

public class CreateGraphUsingList {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        int V = 5;

        //int arr[] = new arr[V];
        ArrayList<Edge>[] graph = new ArrayList[V]; //null --> empty arrayList
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }
        //0 - vertex
        graph[0].add(new Edge(0,1,5));
        //1 vartex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //2 vartex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        //3 - vartex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        //4 vartex
        graph[4].add(new Edge(4,2,2));


        //2's neighbors
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i); // src, dest, wt
            System.out.println(e.dest);
        }
        
    }
}
