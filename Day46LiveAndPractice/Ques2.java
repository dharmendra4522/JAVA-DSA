//Delete N Nodes After M Nodes of a Linked List
public class Ques2 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void linkDelete(Node head, int M, int N){
        int count = 0;
        Node curr = head;
        // Traverse M nodes
        while(curr != null && curr.next != null){
            count++;
            int x = N;
            if(count == M){
                while(x > 0){
                    curr.next = curr.next.next;
                    // If we reached the end, return
                    if(curr.next == null){
                        return;
                    }
                    count  = 0;
                    x--;
                }
                x=N;
            }
            curr = curr.next;
                
        }

    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node head;
    public static Node tail;

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            // If the list is empty, set head to the new node
            head = newNode;
        }
        else{
            Node tail = head;
            while(tail.next != null){
                // Traverse to the last node
                tail = tail.next;

            }
            tail.next = newNode;  // Link the last node to the new node

        }
        
    }


    public static void main(String[] arge){
        // Node head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(6);
        // head.next.next.next.next.next.next = new Node(7);
        // head.next.next.next.next.next.next.next = new Node(8);

        Ques2 ll = new Ques2();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);





        System.out.println("Original List:");
        printList(head);

        linkDelete(head, 2, 2);

        System.out.println("Modified List:");
        printList(head);
    }

}
