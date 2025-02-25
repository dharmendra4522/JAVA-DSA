package Day91DP2;

public class UnboundedKnapsack {

    public static int unboundedKnapsack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        // Initialize 0th row and 0th column to 0 (already done by default in Java
        // arrays)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; // 0th column
        }
        for (int j = 0; j <= W; j++) {
            dp[0][j] = 0; // 0th row
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1 ; j++) {
                int w = wt[i - 1]; // ith item wt
                if (w <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
         print(dp);
        return dp[n][W];
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        // tabulation method
        System.out.println("Using Tabulation " + unboundedKnapsack(val, wt, W));

    }
}
