package Day97PracticeDP4;

public class PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        if(sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for(int num: nums) {
            for(int i = sum; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];

            }
        }

        return dp[sum];
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        
        System.out.println("Can the array be partitioned into two subsets with equal sum: "+canPartition(arr));
    }
}
