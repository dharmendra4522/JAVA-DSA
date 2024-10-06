package Day56GreedyLive;

public class Question5 {
    private static boolean canSplit(int[] array, int K, int maxSum) {
        int currentSum = 0;
        int subarrays = 1;  // Start with one subarray

        for (int num : array) {
            if (currentSum + num > maxSum) {
                // If adding this number exceeds maxSum, we start a new subarray
                subarrays++;
                currentSum = num;  // Start the new subarray
                if (subarrays > K) {
                    return false;  // More than K subarrays means mid is too small
                }
            } else {
                currentSum += num;  // Add this number to the current subarray
            }
        }
        return true;  // We successfully split into K or fewer subarrays
    }

    // Main function to find the minimum possible maximum subarray sum
    public static int splitArray(int[] array, int K) {
        int maxElement = 0;
        int totalSum = 0;

        // Find the maximum element and total sum of the array
        for (int num : array) {
            maxElement = Math.max(maxElement, num);
            totalSum += num;
        }

        // Binary search between maxElement (minimum max sum) and totalSum (maximum max sum)
        int low = maxElement;
        int high = totalSum;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if we can split with this mid value as the max sum
            if (canSplit(array, K, mid)) {
                high = mid;  // Try for a smaller maximum sum
            } else {
                low = mid + 1;  // Increase the max sum because we couldn't split with mid
            }
        }

        return low;  // Low will be the minimum possible maximum sum after the binary search
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int K = 3;

        // Find and print the minimum possible maximum subarray sum
        System.out.println("Minimum possible maximum subarray sum: " + splitArray(array, K));
    }
}
