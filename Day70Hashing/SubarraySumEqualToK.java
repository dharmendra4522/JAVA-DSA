package Day70Hashing;
import java.util.*;
public class SubarraySumEqualToK {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        // System.out.println(subarraySum(arr, k));
        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum, count)
        int sum = 0;
        int ans = 0;

        for(int i=0; i<arr.length; i++){ //O(n)
            sum += arr[i]; //sum(j)
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k)+1;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}
