public class ZigZag {
    public static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    //print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

public static void zigZag(){
    //find midd
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
    


    //reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

    }
    Node right = prev;
    Node left = head;
    Node nextL, nextR;

    //alternate merge --> zig-zag merge
    while(left != null && right != null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        //update
        left = nextL;
        right = nextR;

    }
}
    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        //1->2->3->4->5
        System.out.println("Before Zig-Zag");;
        ll.print();
        System.out.println("After Zig-Zag");
        ll.zigZag();
        ll.print();
    }
}

