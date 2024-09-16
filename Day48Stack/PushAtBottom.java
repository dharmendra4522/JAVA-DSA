package Day48Stack;
import java.util.*;
public class PushAtBottom {

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
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
      System.out.println("before add the data at bottom: "+s);
        pushAtBottom(s, 4);

        System.out.println("after add the data at bottom: ");
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
    }
}
