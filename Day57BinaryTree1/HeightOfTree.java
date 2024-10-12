package Day56Tree;
import java.util.*;

public class HeightOfTree {
    // Node class representing a node in the binary tree
    static class Node {
        int data;  // value of the node
        Node left, right;  // references to the left and right children

        // Constructor to initialize the node
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to calculate the height of the binary tree
    public static int height(Node root) {
        // Base case: If the node is null, the height is 0
        if (root == null) {
            return 0;
        }

        // Recursively calculate the height of the left and right subtrees
        int lh = height(root.left);
        int rh = height(root.right);

        // The height of the current node is the maximum of the left and right subtree heights plus 1
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        // Construct the following binary tree:
        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  5 6  7 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Calculate and print the height of the tree
        System.out.println("Height of tree is " + height(root));
    }
}
