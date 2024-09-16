public class DectectLoop {
    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Known As Floyd's Cycle Finding Algorithm
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //slow-> +1
            fast = fast.next.next; //fast -> +2
            if(slow == fast){
                return true; //cycle exist
            }
        }
        return false;//cycle doesn't exist
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        //1->2->3->1
        System.out.println(isCycle());

    }
    
}
