package Day68Heap;
import java.util.*;

public class ConnectNRopes {
    public static void main(String[] args) {
        int ropes[] = {2,3,3,4,6};
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = ropes.length;
        for(int i=0;i<n;i++){
            pq.add(ropes[i]);

        }
        int cost =0;
        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();
            cost = cost + min + min2;
            pq.add(min+min2);
     
        }
        System.out.println("cost of connecting n ropes = "+cost);
    }
}
