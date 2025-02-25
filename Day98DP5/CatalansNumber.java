package Day98DP5;
import java.util.*;

public class CatalansNumber {
    public static int catalanResursion(int n){
        if(n <= 1){
            return 1;
        }

        int ans = 0; //initialize the answer
        for(int i = 0; i < n; i++){
            ans += catalanResursion(i) * catalanResursion(n-i-1);

        }
        return ans;
            
    }
    public static int catalanMem(int n, int dp[]){
        if(n <= 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += catalanMem(i, dp) * catalanMem(n-i-1, dp);
        }
        return dp[n] = ans;

    }
    public static int catalanTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i-j-1];

            }

        }
        return dp[n];
    }
        
    public static void main(String[] args) {
        // int n = 30;
        // System.out.println(""+catalanResursion(n));

        // int dp[] = new int[n+1];
        // Arrays.fill(dp, -1);
        // System.out.println(catalanMem(n, dp));
        System.out.println(catalanTab(5));

    }
}
