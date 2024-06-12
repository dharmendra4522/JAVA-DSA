package Day21LiveSorting;

import java.util.*;

public class InsertionSort {
    // InsertionSort => Inserting the element @ the correct position

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Element: ");
        int n = sc.nextInt();

        System.out.print("Enter the Element: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int curr = arr[i];

            while (j > 0 && arr[j] < curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
        System.out.print("Your Insertion Sorted Array in Descending Order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Insertion Sort
// TC : O(n^2)
// SC : O(1)
