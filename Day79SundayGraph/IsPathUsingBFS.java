package Day79SundayGraph;

import java.util.*;

public class IsPathUsingBFS {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    



    public boolean bfs(ArrayList<Edge>[] adj, int src, int dest, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (q.size() != 0) {
            //pop the front node from queue
            src = q.remove();

            //check if it  is visites
            if(vis[src] == true) continue;
               //if yes: discard - continue
               //else marked visited
               else vis[src] = true;
            
            if(src == dest) return true;

            //push the unvisited neighbors
            for(int nbr : adj[src]){
                if(vis[nbr] == false) continue;
                q.add(nbr);
            }
        }
        return bsf(adj, src, dest, vis);
    }

}
