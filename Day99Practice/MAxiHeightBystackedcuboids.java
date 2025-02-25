import java.util.Arrays;

public class MAxiHeightBystackedcuboids {
    public int helper(int[][] nums, int prevIndex, int nextIndex, Integer[][] memo) {
        if (nextIndex >= nums.length) {
            return 0;
        }

        if (memo[nextIndex][prevIndex + 1] != null) {
            return memo[nextIndex][prevIndex + 1];
        }

        // Case 0: Do not take the current cuboid
        int maxLen = helper(nums, prevIndex, nextIndex + 1, memo);

        // Case 1: Take the current cuboid if it can be stacked
        if (prevIndex == -1 || (nums[prevIndex][0] >= nums[nextIndex][0] &&
                nums[prevIndex][1] >= nums[nextIndex][1] &&
                nums[prevIndex][2] >= nums[nextIndex][2])) {
            maxLen = Math.max(maxLen, nums[nextIndex][2] + helper(nums, nextIndex, nextIndex + 1, memo));
        }

        memo[nextIndex][prevIndex + 1] = maxLen;
        return maxLen;
    }

    public int maxHeight(int[][] cuboids) {
        // Sort each cuboid's dimensions so that w ≤ d ≤ h
        for (int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }

        // Sort all cuboids in decreasing order of (width, depth, height)
        Arrays.sort(cuboids, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(b[0], a[0]);
            if (a[1] != b[1])
                return Integer.compare(b[1], a[1]);
            return Integer.compare(b[2], a[2]);
        });

        // Memoization array
        Integer[][] memo = new Integer[cuboids.length][cuboids.length + 1];

        return helper(cuboids, -1, 0, memo);
    }

    public static void main(String[] args) {
        MAxiHeightBystackedcuboids solution = new MAxiHeightBystackedcuboids();
        int[][] cuboids = { { 50, 45, 20 }, { 95, 88, 37 }, { 45, 23, 12 } };
        System.out.println("Maximum height of stacked cuboids: " + solution.maxHeight(cuboids));
    }
}
