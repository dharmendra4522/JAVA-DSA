public class Ques1 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node head;
    private static Node tail;
    private static int size;

    public static Node getIntersectionNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Ques1 list = new Ques1();
        Node head1, head2;

        head1 = list.new Node(10);
        head2 = list.new Node(3);

        Node newNode = list.new Node(6);
        head2.next = newNode;

        newNode = list.new Node(9);
        head2.next.next = newNode;

        newNode = list.new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = list.new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint = getIntersectionNode(head1, head2);
        if (intersectionPoint == null) {
            System.out.print("No Intersection Point\n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);
        }
    }
}
