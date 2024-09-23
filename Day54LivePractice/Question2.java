package Day54LivePractice;

import java.util.*;

//Connect n ropes with minimum costGivenareNropesofdifferentlengths,thetaskistoconnecttheseropesintooneropewithminimum cost, such that the cost to connect two ropes is equal to the sum of their lengths
public class Question2 {
     static int minCOst( int arr[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int res = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = f irst + second;
            res += sum;
            pq.add(sum);
        }
        return res;
     }


    public static void main(String[] args) {
        int len[] = {4,3,2,6};
        int size = len.length;
        System.out.println("Total cost for connecting"+ " ropes is "+ minCOst(len, size));
        
    }

}
