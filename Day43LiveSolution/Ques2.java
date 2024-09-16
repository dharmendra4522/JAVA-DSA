package Day43LiveSolution;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ques2 {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = nums.size();

        Collections.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i != 0 && (nums.get(i - 1) == (nums.get(i) - 1) || nums.get(i - 1) == nums.get(i))) {
                continue;
            }

            if (i != 0 && (nums.get(i + 1) == (nums.get(i) + 1) || nums.get(i + 1) == nums.get(i))) {
                continue;
            }
            result.add(nums.get(i));

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        ArrayList<Integer> result = findLonely(nums);
        System.out.println("The lonely numbers are:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();

    }
}
