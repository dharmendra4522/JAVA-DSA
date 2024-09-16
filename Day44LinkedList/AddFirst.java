package Day44LinkedList;

public class AddFirst {
    public static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        //Add first
        public void addFirst(int data){
            //Step1 -> create a new node
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail= newNode;
                return;
            }

            //step2 -> newNode's next = head
            newNode.next = head;

            //step3 -> head = newNode
            head = newNode;

        }
        //Print Node
        public void print(){
            //base case
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
    public static void main(String[] args){
        AddFirst ll = new AddFirst();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();
    }
}
