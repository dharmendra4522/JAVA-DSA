package Day48Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //check if stack is full then return
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            //the last element of arraylist is top element of stack
            int top = list.get(list.size()-1);
            //remove the last element of arraylist
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            //the last element of arraylist is top element of stack
            return list.get(list.size()-1);
            


        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
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
