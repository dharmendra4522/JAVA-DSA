package Day98DP5;

public class MountainRanges {
    public static int mountainRanges(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < i; j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside;

            }
                
        }
        return dp[n];
        }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainRanges(n));
    }
}
