package Day48Stack;

import java.util.*;

public class NextGreaterEle {

    public static void main(String[] args) {  //O(n)
        int[] arr = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1. while loop run for stack is empty or top element of stack is less then or
            // equal arr index element

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2. if stack is empty then assign -1 to nextGreater array
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // 3. push in s
            s.push(i);

        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
