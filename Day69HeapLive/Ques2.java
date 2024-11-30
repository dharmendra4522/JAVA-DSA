package Day69HeapLive;

import java.util.*;

public class Ques2 {
    // Function to calculate minimum time to visit all positions
    public static void minTime(int arr[], int N, int K) {

        // Create a queue to perform BFS (Breadth-First Search)
        Queue<Integer> q = new LinkedList<>();

        // Create a boolean array to keep track of visited positions
        boolean[] vis = new boolean[N + 1]; // N+1 because positions range from 1 to N

        // Variable to track time (the number of levels in BFS)
        int time = 0;

        // Add the initial positions to the queue and mark them as visited
        for (int i = 0; i < K; i++) {
            q.add(arr[i]); // Add each starting position to the queue
            vis[arr[i]] = true; // Mark each starting position as visited
        }

        // Perform BFS to explore all possible positions
        while (!q.isEmpty()) {
            // Get the size of the queue, which represents the number of positions at the
            // current time level
            int size = q.size();

            // For each position in the queue (at the current time level)
            for (int i = 0; i < size; i++) {
                int curr = q.poll(); // Remove the front position from the queue

                // Check if we can move to the position on the left (curr - 1)
                if (curr - 1 >= 1 && !vis[curr - 1]) { // Ensure we stay within valid bounds and haven't visited this
                                                       // position
                    vis[curr - 1] = true; // Mark the left position as visited
                    q.add(curr - 1); // Add the left position to the queue to explore it in the next iteration
                }

                // Check if we can move to the position on the right (curr + 1)
                if (curr + 1 <= N && !vis[curr + 1]) { // Ensure we stay within valid bounds and haven't visited this
                                                       // position
                    vis[curr + 1] = true; // Mark the right position as visited
                    q.add(curr + 1); // Add the right position to the queue to explore it in the next iteration
                }
            }

            // Increment time after finishing exploring all positions at the current time
            // level
            time++;
        }

        // Since time was incremented once more than required after the last level,
        // subtract 1 to get the correct result
        System.out.println(time - 1); // Print the time taken to visit all positions
    }

    // Main function to test the minTime function
    public static void main(String[] args) {

        // Define the number of positions (1 to N)
        int N = 6;

        // Define the initial starting positions in the array arr[]
        int arr[] = { 2, 6 };

        // The number of initial positions
        int K = arr.length;

        // Call the minTime function to calculate and print the minimum time
        minTime(arr, N, K);
    }
}
