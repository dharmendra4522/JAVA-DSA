package Day67BinarySearchTree2Live;

public class Ques1 { // Made the class public
    public class Node {
        int data;
        Node left, right;
        
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    public static int rangeSum(Node root, int l, int r) {
        if (root == null) return 0;
        int sum = 0;
        
        // Check if the current node's value is in the range [L, R]
        if (l <= root.data && root.data <= r) {
            sum += root.data;
        }
        
        // Traverse the left subtree if root.data is greater than l
        if (root.data > l) {
            sum += rangeSum(root.left, l, r);
        }
        
        // Traverse the right subtree if root.data is less than r
        if (root.data < r) {
            sum += rangeSum(root.right, l, r);
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Ques1 tree = new Ques1(); // Create an instance of Ques1 to access the Node class
        Node root = tree.new Node(20); // Use the instance to create Node objects
        root.left = tree.new Node(8);
        root.right = tree.new Node(22);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(12);
        root.left.right.left = tree.new Node(10);
        root.left.right.right = tree.new Node(14);
        
        System.out.println("Sum of range: " + rangeSum(root, 8, 22));
    }
}