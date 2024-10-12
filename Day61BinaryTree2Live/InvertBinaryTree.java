package Day60Tree2Live;

public class InvertBinaryTree {
    // Define the Node class for the binary tree
    static class Node {
        int data;
        Node left, right;

        // Constructor for creating a new node
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Method to invert the binary tree
    public static Node invert(Node root) {
        // Base case: if the tree is empty, return null
        if (root == null) return null;

        // Swap the left and right children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        invert(root.left);
        invert(root.right);
        return root;  // Return the root of the inverted tree
    }

    // Method to print the tree in-order (for visualization)
    public static void printInOrder(Node root) {
        if (root == null) return;
        printInOrder(root.left);    // Visit left subtree
        System.out.print(root.data + " "); // Visit node
        printInOrder(root.right);   // Visit right subtree
    }

    public static void main(String[] args) {
        // Create the original binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Original Tree (in-order):");
        printInOrder(root);
        System.out.println();

        // Invert the binary tree
        root = invert(root);

        // Print the inverted binary tree in order
        System.out.println("Inverted Binary Tree (in-order):");
        printInOrder(root); // This will print the inverted tree's values in order
    }
}
