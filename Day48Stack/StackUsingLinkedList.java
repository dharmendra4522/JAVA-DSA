package Day48Stack;

public class StackUsingLinkedList {

    //create node for linkedlist
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next =null;
        }
    }

    static class Stack{
        static Node head = null;

        //check stack is empty or not
        public static boolean isEmpty(){
            return head == null;
        }

        //push
        //add element 
        // create a newNode and assign the next of newNode to the head's node of list
        // and then make the head of newNode 

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pup

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            //head is top element
            int top = head.data;
            //now head point to next node
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            //return the data of head node or top of the stack;
            return head.data;
            
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
