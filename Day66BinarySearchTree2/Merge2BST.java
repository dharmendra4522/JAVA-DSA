package Day66BinarySearchTree2;

import java.util.*;

public class Merge2BST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Perform in-order traversal to fill the array with BST values
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    // Create a balanced BST from a sorted array
    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) return null;
        int mid = (st + end) / 2; // Find the middle element
        Node root = new Node(arr.get(mid)); // Create a new node
        root.left = createBST(arr, st, mid - 1); // Recursively create left subtree
        root.right = createBST(arr, mid + 1, end); // Recursively create right subtree
        return root;
    }

    // Merge two BSTs
    public static Node mergeBSTs(Node root1, Node root2) {
        // Step 1: Get in-order traversal of both BSTs
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // Step 2: Merge the two sorted arrays
        ArrayList<Integer> finalArr = new ArrayList<>(); // Fixed typo here
        int i = 0, j = 0;

        // Merge the two arrays
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                finalArr.add(arr1.get(i)); // Add from arr1
                i++;
            } else {
                finalArr.add(arr2.get(j)); // Add from arr2
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // Create a balanced BST from the merged sorted array
        return createBST(finalArr, 0, finalArr.size() - 1); // Use finalArr here
    }

    // Pre-order traversal to display the tree
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preorder(root); // Display the merged BST
    }
}
