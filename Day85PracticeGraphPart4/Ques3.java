package Day85PracticeGraphPart4;

import java.util.*;

public class Ques3 {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>>adj = new ArrayList<>();

        for(int i=0; i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

         int indegree[] = new int[n];

        for(int i=0; i<prerequisites.length; i++){
            int a = prerequisites[i][0];
            int b= prerequisites[i][1];
            adj.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans =  new ArrayList<>();
        while(q.size()>0){
            int curr = q.remove();
            ans.add(curr);
            for(int conn: adj.get(curr)){
                indegree[conn]--;

                if(indegree[conn]==0){
                    q.add(conn);
                }
            }
        }
        if(ans.size()==n){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Ques3 q = new Ques3();
        int n = 3;
        int[][] prerequisites = {{1, 0}, {2, 0}};
        System.out.println(q.canFinish(n, prerequisites));
    }
}
