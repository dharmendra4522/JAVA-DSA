package Day53Queue;
import java.util.*;

public class Ques7QueueUsingDeque {
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        public void add(int data) {
            deque.addLast(data);
        }
        public int remove(){
           return deque.removeFirst();
        }
        public int peek(){
            return deque.peekFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
