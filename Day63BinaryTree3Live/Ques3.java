package Day63BinaryTree3Live;

public class Ques3 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node deleteLeafNode(Node root, int x) {
        if (root == null) {
            return null; // Base case
        }

        // Recursively delete leaf nodes in left and right subtrees
        root.left = deleteLeafNode(root.left, x);
        root.right = deleteLeafNode(root.right, x);

        // If the current node is a leaf with the target value, return null
        if (root.left == null && root.right == null && root.data == x) {
            return null;
        }
        return root; // Return the current node if it's not deleted
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return; // Base case
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        int x = 3; // Target value to delete leaf nodes
        System.out.println("Original tree (Preorder):");
        preOrder(root); // Print original tree
        System.out.println();

        root = deleteLeafNode(root, x); // Update root after deletion

        System.out.println("Tree after deleting leaf nodes with value " + x + " (Preorder):");
        preOrder(root); // Print tree after deletion
        System.out.println();
    }
}
