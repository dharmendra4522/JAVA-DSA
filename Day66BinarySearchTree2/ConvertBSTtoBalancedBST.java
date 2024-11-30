package Day66BinarySearchTree2;

import java.util.*;

public class ConvertBSTtoBalancedBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Preorder traversal for testing
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Get the inorder traversal of the tree
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    // Create a balanced BST from the sorted inorder list
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);
        return root;
    }

    // Convert the given BST to a balanced BST
    public static Node BalancedBST(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);  // Get the sorted inorder representation
        return createBST(inorder, 0, inorder.size() - 1);  // Create balanced BST
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = BalancedBST(root);  // Convert to balanced BST
        preorder(root);  // Print preorder of the balanced BST
    }
}
