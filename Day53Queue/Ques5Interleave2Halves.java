package Day53Queue;
import java.util.*;

public class Ques5Interleave2Halves {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        
        // Add the first half of the elements to firstHalf
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.poll());
        }

        // Interleave the two halves
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
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

        interLeave(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
