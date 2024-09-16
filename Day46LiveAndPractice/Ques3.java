public class Ques3 {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head; // Head of the linked list

    // Method to swap nodes in the linked list
    public void swapNodes(int x, int y) {
        // If x and y are the same, no need to swap
        if (x == y)
            return;

        // Search for x (keep track of current and previous nodes)
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // Search for y (keep track of current and previous nodes)
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, do nothing
        if (currX == null || currY == null)
            return;

        // If x is not the head of the linked list
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        // If y is not the head of the linked list
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        // Swap the next pointers of currX and currY
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // Method to insert a new node at the beginning of the linked list
    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    // Method to print the linked list
    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ques3 llist = new Ques3();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("Linked list before swap: ");
        llist.printList();

        llist.swapNodes(4, 3);

        System.out.print("Linked list after swap: ");
        llist.printList();
    }
}
