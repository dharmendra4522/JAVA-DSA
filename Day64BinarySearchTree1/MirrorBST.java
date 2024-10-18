package Day64BinarySearchTree1;

import java.util.Scanner;

public class MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node createMirror(Node root) {
        if (root == null) return null;

        // Recursively create mirrors of the left and right subtrees
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        
        // Swap left and right children
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Build the BST
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        System.out.println("Original Pre-Order Traversal:");
        preOrder(root);
        System.out.println();

        root = createMirror(root);
        System.out.println("Pre-Order Traversal of Mirrored Tree:");
        preOrder(root);
        System.out.println();
        
        scanner.close();
    }
}
