package Day69HeapLive;

import java.util.PriorityQueue;

public class Ques1 {
    // Standalone class KthLargest
    public static class KthLargest {
        private PriorityQueue<Integer> pq;
        private int k;

        // Constructor to initialize the KthLargest object
        public KthLargest(int k, int[] nums) {
            this.k = k;
            pq = new PriorityQueue<>(k);

            // Add initial numbers to the priority queue to maintain the K largest elements
            for (int num : nums) {
                add(num);
            }
        }

        // Method to add a new value to the stream and return the Kth largest element
        public int add(int val) {
            if (pq.size() < k) {
                pq.offer(val);
            } else if (val > pq.peek()) {
                pq.poll();
                pq.offer(val);
            }
            return pq.peek();
        }
    }

    public static void main(String[] args) {  // Corrected 'arge' to 'args'
        int k = 3;
        int[] nums = { 4, 5, 8, 2 };
        KthLargest kthLargest = new KthLargest(k, nums);  // Corrected 'kthLargest' to 'KthLargest'

        // Testing the add method and printing the Kth largest element after each addition
        System.out.println(kthLargest.add(3));  // returns 4
        System.out.println(kthLargest.add(5));  // returns 5
        System.out.println(kthLargest.add(10)); // returns 5
        System.out.println(kthLargest.add(9));  // returns 8
    }
}
