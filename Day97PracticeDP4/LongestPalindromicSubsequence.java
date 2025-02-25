package Day97PracticeDP4;

public class LongestPalindromicSubsequence {
    public static int longestPalindromicSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for(int i = 0; i < n - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i+1] =2;
            } else{
                dp[i][i+1] = 1;
            }
        }
        for(int length = 3; length <= n; length++) {
            for(int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if(s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i+1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }

            }
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println("Longest Palindromic Subsequence is: "+longestPalindromicSubsequence(s));
    }
}
