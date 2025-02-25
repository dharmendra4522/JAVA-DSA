package Day90DP1PracticeQs;

public class TribonacciNumber {
    // Plain Recursive Approach (Inefficient)
    public static int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    // Memorization Approach (Efficient O(n) with O(n) space)
    public static int tribonacciMemoization(int[] dp, int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (dp[n] != -1) { // Check if already computed
            return dp[n];
        }
        dp[n] = tribonacciMemoization(dp, n - 1) + tribonacciMemoization(dp, n - 2) + tribonacciMemoization(dp, n - 3);
        return dp[n];
    }

    // Tabulation Approach (Efficient O(n) with O(n) space)
    public static int tribonacciTabulation(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        // Recursive Approach
        System.out.println("Recursive: " + tribonacci(n));

        // Memoization Approach
        int[] dpMemo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dpMemo[i] = -1; // Initialize with -1
        }
        System.out.println("Memoization: " + tribonacciMemoization(dpMemo, n));

        // Tabulation Approach
        System.out.println("Tabulation: " + tribonacciTabulation(n));
    }
}
