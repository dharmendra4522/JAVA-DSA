package Day54LivePractice;

import java.util.*;

// Reversing the first K elements of a Queue
public class Question4 {
    public static void reverse(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size() || k <= 0) {
            return;
        }
        
        Stack<Integer> s = new Stack<>();

        // Push the first k elements into the stack
        for (int i = 0; i < k; i++) {
            s.push(q.poll()); // poll() already removes the element
        }

        // Pop elements from the stack and add them back to the queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Move the remaining elements (after k) to the back of the queue
        int remainingSize = q.size() - k; // Take the snapshot of current size
        for (int i = 0; i < remainingSize; i++) {
            q.add(q.poll()); // Move front element to the back
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        
        int k = 5;
        System.out.println("Original Queue: " + q);
        reverse(q, k);
        System.out.print("Queue after reversing first " + k + " elements: ");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
