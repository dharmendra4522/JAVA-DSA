package Day90DP1PracticeQs;

public class MinPathSum {

    // Recursive Approach (Inefficient)
    public static int minPathSum_recursive(int grid[][], int n, int m) {
        if (n < 0 || m < 0) {
            return Integer.MAX_VALUE;
        }
        if (n == 0 && m == 0) {
            return grid[0][0];
        }
        return grid[n][m] + Math.min(minPathSum_recursive(grid, n - 1, m), minPathSum_recursive(grid, n, m - 1));
    }

    // Memoization Approach (Efficient O(m * n) with O(m * n) space)
    public static int minPathSum_memorization(int grid[][], int n, int m, int dp[][]) {
        if (n < 0 || m < 0) {
            return Integer.MAX_VALUE;
        }
        if (n == 0 && m == 0) {
            return grid[0][0];
        }
        if (dp[n][m] != -1) { // If already computed
            return dp[n][m];
        }
        dp[n][m] = grid[n][m] + Math.min(
            minPathSum_memorization(grid, n - 1, m, dp),
            minPathSum_memorization(grid, n, m - 1, dp)
        );
        return dp[n][m];
    }

    // Tabulation Approach (Efficient O(m * n) with O(m * n) space)
    public static int minPathSum_tabulation(int grid[][]) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];
        dp[0][0] = grid[0][0];

        // Fill first row
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        // Fill first column
        for (int j = 1; j < m; j++) {
            dp[j][0] = dp[j - 1][0] + grid[j][0];
        }

        // Fill the rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int grid[][] = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        // Recursive
        System.out.println("Recursive: " + minPathSum_recursive(grid, grid.length - 1, grid[0].length - 1));

        // Memoization
        int dp[][] = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dp[i][j] = -1; // Initialize DP array
            }
        }
        System.out.println("Memoization: " + minPathSum_memorization(grid, grid.length - 1, grid[0].length - 1, dp));

        // Tabulation
        System.out.println("Tabulation: " + minPathSum_tabulation(grid));
    }
}
