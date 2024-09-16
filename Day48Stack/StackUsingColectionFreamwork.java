package Day48Stack;
import java.util.*;

public class StackUsingColectionFreamwork {
    //implement static usin java collection freamwork

    public static void main(String[] args) {
        // Stack s = new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        //traverse the stack 
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
        
    }
}
