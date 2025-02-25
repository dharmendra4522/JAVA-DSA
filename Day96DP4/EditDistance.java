package Day96DP4;

public class EditDistance {
    public static int editDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) dp[i][0] = i;  // Deleting all characters
        for (int j = 0; j <= m; j++) dp[0][j] = j;  // Inserting all characters

        // Bottom-up DP
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) { // Same character, no cost
                    dp[i][j] = dp[i - 1][j - 1];
                } else { // Choose the best among add, delete, and replace
                    int del = dp[i - 1][j] + 1;     // Delete from s1
                    int add = dp[i][j - 1] + 1;     // Insert into s1
                    int rep = dp[i - 1][j - 1] + 1; // Replace character
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "intention";
        String s2 = "execution";    
        System.out.println(editDistance(s1, s2)); // Expected output: 5
    }
}
