public class CircularSLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    // Insertion in the beginning in the circular DLL

    // At the start of the circular DLL
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;

        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;

        }
       
    }
    //Insertion between two Nodes
    public void insertMid(int data int prev){
        Node newNode = new Node(data);
        Node prevNode = head;
        while(prevNode.data != prev){
            prevNode = prevNode.next;
            if(prevNode == null){
                System.out.println("NOde not found");
                return;

            }
            newNode.next = prevNode.next;
            prevNode.next=newNode;

        }
        System.out.println("Node insert at middle sucessfully");
    }

    // print
    public void print() {
        // base case
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularSLL c = new CircularSLL();
        c.insertAtStart(3);
        c.insertAtStart(2);
        c.insertAtStart(1);

        c.print();
       
        c.insertMid(4,2);



    }

}
