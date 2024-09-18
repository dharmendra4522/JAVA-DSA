package Day53Queue;

import java.util.*;

public class Ques3StackUsing2Queue {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Check if the stack is empty
        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push an element onto the stack
        public void push(int data) {
            // Always add to the non-empty queue
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            int top = -1;

            // Case 1: If q1 is not empty, shift elements from q1 to q2
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;  // We've reached the last element, which is the top of the stack
                    }
                    q2.add(top);
                }
            }
            // Case 2: If q2 is not empty, shift elements from q2 to q1
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;  // We've reached the last element, which is the top of the stack
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        // Peek the top element of the stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            int top = -1;

            // Case 1: If q1 is not empty, shift elements and get the top
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);  // Move elements back to q2
                }
            }
            // Case 2: If q2 is not empty, shift elements and get the top
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);  // Move elements back to q1
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        // Pop and print elements until the stack is empty
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
