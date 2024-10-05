package Day55Gready;
import java.util.*;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) { //O(nlogn)
        int pairs[][] = {{5, 24,}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        int n = pairs.length;
        Arrays.sort(pairs, Comparator.comparingDouble(o ->o[1]));
        int chainLen = 1;
        int pairEnd = pairs[0][1]; //Last selected pair end chain end
        for(int i=1; i<n; i++){
            if(pairs[i][0] > pairEnd){
                chainLen++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("max length of chain = " +chainLen);
    }
}
