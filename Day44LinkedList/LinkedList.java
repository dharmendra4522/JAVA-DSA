package Day44LinkedList;

public class LinkedList {
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

    // Method for add element and remove print and search
    public void addFirst(int data) {
        // Step 1 = Create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) { // linked lit is empty
            head = tail = newNode;
            return;
        }

        // Step 2= newNode next = head
        newNode.next = head; // linking step

        // step3 = head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step1 => Create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) {// linked list is empty
            head = tail = newNode;
            return;
        }
        // Step2=> tail.next = newNode
        tail.next = newNode;

        // Step3 = tail = newNode
        tail = newNode;
    }

    //Mathod to print list item
    public void  print(){
        //base case
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    } 
    //Add in the middle
    public void addMiddle(int idx, int data){
        //add to the head
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //remove node at first position
    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;//-infitity
        } else if (size ==1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val; 
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    //Remove note at last position
    public int removeLast(){ 
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size ==1) {
            int val = head.data;
            head = tail= null;
            size =0;
            return val;   
        }
        //prev : i = size-2
        Node prev = head;
        for(int i =0; i<size-2; i++){
            prev = prev.next;
        }

        //store the tail data
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //search(Iterative)
    public int itrSearch(int key){  //O(n)
        Node temp = head;
        int i =0;
        while(temp != null){
            if(temp.data == key){ //key found
                return i;
            }
            temp = temp.next;
            i++;

        }
        //key not found
        return -1;
    }
    //Search(Recursive)
    public int helper(Node head, int key){
          if (head == null){
            return -1;
        } 
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //Reverse a linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //Find & Remove Nth nodes from end
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;

        }
        //If head is to be deleted
        if(n == sz){
            head = head.next; //remove first 
            return;
        }

        //sz-n
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;  
        }
        prev.next = prev.next.next; //remove nth
    }
    //Find middle -> Slow & Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2

        }
        return slow; //slow is my midNode
    }
    //check palindrome
    public boolean checkPalindrome(){
        //base case
        if(head == null || head.next == null){
            return true;
        }

        //Step1 - find mid
        Node midNode = findMid(head);

        //Step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode.next;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head; 

        //Step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
         
        //Add in the middle
        ll.addMiddle(2,3);
        ll.print();

        //Delete Nth node from end
        ll.deleteNthFromEnd(3);
        ll.print();

         //Reverse a linked list
         ll.reverse();
         ll.print();
         
        System.out.println("Size of linkedList "+ll.size);
        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        //Iterative search
        System.out.println("Key is found at index: "+ll.itrSearch(3));
        System.out.println("Key is found at index: "+ll.itrSearch(10));
        //Recursive search
        System.out.println("Key is found at index: "+ll.recSearch(3));
        System.out.println("Key is found at index: "+ll.recSearch(10));

        // LinkedList ll2 = new LinkedList();
        // ll2.addLast(1);
        // ll2.addLast(2);
        // ll2.addLast(2);
        // ll2.addLast(1);

        // ll2.print(); // 1->2->2->1
        // //check Palindrome
        // System.out.println(ll2.checkPalindrome());
        

       

    }
}
