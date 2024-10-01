package Day55Gready;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Feactional_Knapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        //0th col => idx; 1st col => ratio 

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] /(double) wt[i];

        }
        //ascending order sort
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalVal =0;
        for(int i=ratio.length-1; i>= 0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){
                finalVal += val[idx];
                capacity -= wt[idx];
            } else{
                //include fraction items
                finalVal += (ratio[i][1] * capacity);
                capacity= 0; 
                break;
            }

        }
        System.out.println("final value = "+ finalVal);
    }
}
