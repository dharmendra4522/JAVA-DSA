package Day60Tree2Live;

/**
 * UniValuedBinaryTree
 */
public class UniValuedBinaryTree {

    // Define the Node class for the binary tree
    static class Node {
        int data; 
        Node left, right;

        // Constructor for creating a new node
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to check if the binary tree is univalue
    public static boolean isUnivalue(Node root) {
        // Base case: if the tree is empty, it's considered univalue
        if (root == null) return true;

        // Check if the left child exists and if its value is different from the root
        if (root.left != null && root.data != root.left.data) return false;

        // Check if the right child exists and if its value is different from the root
        if (root.right != null && root.data != root.right.data) return false;

        // Recursively check the left and right subtrees
        boolean leftCall = isUnivalue(root.left);
        boolean rightCall = isUnivalue(root.right);
        
        // Return true only if both subtrees are univalue
        return leftCall && rightCall;
    }
    // //mApporach 2
    // public static boolean isUnivalue(Node root int parVal) {
    //     // Base case: if the tree is empty, it's considered univalue
    //     if (root == null) return true;
    //     if(root != parVal) return false;
    //     // Recursively check the left and right subtrees
    //     boolean leftCall = isUnivalue(root.left, root.data);
    //     boolean rightCall = isUnivalue(root.right, root.data);
    //     return leftCall && rightCall;

    // }

    public static void main(String[] args) {
        // Create a univalue binary tree
        Node root = new Node(1);
        root.left = new Node(1);  // Left child has the same value
        root.right = new Node(1);  // Right child has the same value
        root.left.left = new Node(1);  // Left-left child
        root.left.right = new Node(1);  // Left-right child
        root.right.left = new Node(1);  // Right-left child
        root.right.right = new Node(1);  // Right-right child
        
        // Call the isUnivalue method and store the result
        boolean result = isUnivalue(root);
        
        // Print the result
        System.out.println("Is the binary tree univalue? -> " + result);  // Expected output: true
    }
}
