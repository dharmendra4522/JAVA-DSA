// weite the code to find the longest common substring between two strings.
package Day96DP4;

public class LognestCommonSubstring {
    public static int longestCommonSubstring(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int ans = 0;
        int dp[][] = new int[n+1][m+1];
        //intialized the dp array with 0
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                dp[i][j] = 0;
            }
        }
        //botton up
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abgce";
        System.out.println(longestCommonSubstring(s1, s2));
    }
}