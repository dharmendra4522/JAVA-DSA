package Day89DP1;

public class fib {
    public static int fib(int n, int dp[]) {
        if (n == 0 || n == 1) { // base case
            return n;
        }
        return fib(n - 1, dp) + fib(n - 2, dp);
    }

    // fib using tabulation
    public static int fibTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        System.out.println(fib(n, dp));
        System.out.println(fibTab(n));
    }
}
