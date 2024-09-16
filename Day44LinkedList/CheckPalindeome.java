package Day44LinkedList;

public class CheckPalindeome {
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


    //Method to add elements at end of list
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;

        }
        tail.next = newNode;
        tail = newNode;
        size++;
        return;

    }

    //Method to print the list
    public void print(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp= temp.next;
        }
        System.out.println();
    }

    
    // Find middle -> Slow & Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next == null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

        }
        return slow; // slow is my midNode
    }

    // check palindrome
    public boolean checkPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // ... rest of the method

        // Step1 - find mid
        Node midNode = findMid(head);

        // Step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // Step3 - check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]){
        // LinkedList ll = new LinkedList();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(3);

        // ll.print(); 
        // //check Palindrome
        // System.out.println(ll.checkPalindrome());


        LinkedList ll2 = new LinkedList();
        ll2.addLast(1);
        ll2.addLast(2);
        ll2.addLast(2);
        ll2.addLast(1);

        ll2.print(); // 1->2->2->1
        //check Palindrome
        System.out.println(ll2.checkPalindrome());
    }

}
