package Day21LiveSorting;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();


        int arr[] = new int[n];
        System.out.print("Enter Your array element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Array sort in Assending Order
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

    //     //Array sort in Descending Order
    //     for(int i=0; i<n-1; i++){
    //         for(int j=0; j<n-1-i; j++){
    //             if (arr[j] < arr[j + 1]) {
    //                  // swap
    //                  int temp = arr[j];
    //                  arr[j] = arr[j + 1];
    //                  arr[j + 1] = temp;
    //         }
    //     }
    // }

    //Printing Array After Bubble sort
        System.out.print("Sorted Array in Assending Order: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}

//Bubble Sort
// TC : O(n^2)
// SC : O(1)