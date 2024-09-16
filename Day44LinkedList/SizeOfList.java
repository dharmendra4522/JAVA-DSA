package Day44LinkedList;

public class SizeOfList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Add Middle
    public void addMiddle(int data, int idx){
        Node newNode = new Node(data);
        //base case
        if(idx == 0){
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i =0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i = idx-1; temp=> prev
        newNode.next = temp.next;
        temp.next= newNode;
    }

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

    //Size of linked List
    public int size(){
        return size;
    }

    public static void main(String[] args){
        SizeOfList ll = new SizeOfList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();

        ll.addMiddle(4,2);
        ll.print();
        System.out.println(ll.size());
    }
}
