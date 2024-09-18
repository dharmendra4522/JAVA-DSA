package Day53Queue;
import java.util.*;
public class Ques1QueueUsing2Stack {
    static class QueueUsing2Stack {
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();

       public static boolean isEmpty(){
        return s1.isEmpty();
       }
       //add - O(n)
       public static void add(int data){
         // Move all elements from s1 to s2
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        // Push new element into s1
        s1.push(data);

        // Move everything back to s1 from s2
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
       }
       //remove - O(1)
       public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();

       }
       //peek
       public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
       }

    }
    public static void main(String[] args) {
        QueueUsing2Stack q = new QueueUsing2Stack();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }

    
}
