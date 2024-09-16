package Day48Stack;

import java.util.*;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data){

        //check if stack is empty then push the new data
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //otherwise all top data we pop and storen in top 

        int top = s.pop();
        //resursion call
        pushAtBottom(s,data);
        //push the top data back
        s.push(top);

    }

    public static void reverseStack(Stack<Integer> s) {
        // Base case: if stack is empty or has only one element
        if (s.isEmpty()) {
            return;
        }
        // Pop the top element from the stack and store it in a variable
        int top = s.pop();
        reverseStack(s);
        // Push the popped element back to the stack at bottom
        pushAtBottom(s,top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Before reverse Stack: "+s);
        
        reverseStack(s);
        printStack(s);
    }

}
