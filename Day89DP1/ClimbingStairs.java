package Day89DP1;
import java.util.*;

public class ClimbingStairs {
    public static int countWays(int n) { //O(2^n)
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        return countWays(n - 1) + countWays(n - 2);
    }
    //using memorization
    public static int countWays2(int n, int ways[]) { //O(n)
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = countWays2(n - 1, ways) + countWays2(n - 2, ways);
        return ways[n];
    }

    public static int countWaysTab(int n){  //O(n)
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = 1;
            }
            else if(i == 2){
                dp[i] = 2;
            }
            else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWays(n));
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1); //initial value of array is -1
        System.out.println(countWays2(n, ways));
        System.out.println(countWaysTab(n));
    }
}
