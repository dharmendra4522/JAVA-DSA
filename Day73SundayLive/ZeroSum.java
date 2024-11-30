package Day73SundayLive;

import java.util.HashSet;

public class ZeroSum {
    static boolean checkZeroSum(int arr[], int n) {
        int sum = 0;
        HashSet<Integer> seenSums = new HashSet<>(); // Use HashSet for simplicity and clarity

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If the cumulative sum becomes zero or if it's seen before, subarray with zero sum exists
            if (sum == 0 || seenSums.contains(sum)) {
                return true;
            }

            // Add the cumulative sum to the set
            seenSums.add(sum);
        }

        return false; // No subarray with zero sum found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 4, 5}; // Test case with a subarray sum of zero
        int n = arr.length;

        if (checkZeroSum(arr, n)) {
            System.out.println("Array has a subarray with sum 0");
        } else {
            System.out.println("Array does not have a subarray with sum 0");
        }
    }
}
