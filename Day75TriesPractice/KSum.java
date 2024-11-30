package Day75TriesPractice;
import java.util.HashMap;

public class KSum {
    static boolean checkKSum(int arr[], int k, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // Check if the current sum is equal to k
            if (sum == k) {
                return true;
            }

            // Check if there is a previous sum that, when subtracted from current sum, gives k
            if (mp.containsKey(sum - k)) {
                return true;
            }

            // Store the current sum in the map
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10; // Changed k for a valid test case
        int n = arr.length;
        System.out.println(checkKSum(arr, k, n));
    }
}