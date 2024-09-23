package Day54LivePractice;

import java.util.*;

public class Question5_2 {
    static void printSlidingWindowMaxDeque(int arr[], int N, int K) {
        Deque<Integer> dq = new ArrayDeque<>();

        // Process the first K elements
        for (int i = 0; i < K; i++) {
            // Remove elements smaller than the current element from the back of the deque
            while (!dq.isEmpty() && arr[i] >= arr[dq.getLast()]) {
                dq.removeLast();
            }
            // Add the current element index to the deque
            dq.addLast(i);
        }

        // Process the rest of the elements
        for (int i = K; i < N; i++) {
            // The element at the front of the deque is the largest for the previous window
            System.out.print(arr[dq.peek()] + " ");

            // Remove elements that are out of this window
            while (!dq.isEmpty() && dq.peek() <= i - K) {
                dq.removeFirst();
            }

            // Remove all elements smaller than the current element from the back
            while (!dq.isEmpty() && arr[i] >= arr[dq.getLast()]) {
                dq.removeLast();
            }

            // Add the current element index to the deque
            dq.addLast(i);
        }

        // Print the maximum element for the last window
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int N = arr.length;
        int K = 3;

        System.out.println("Sliding window maximums are: ");
        printSlidingWindowMaxDeque(arr, N, K);
    }
}
