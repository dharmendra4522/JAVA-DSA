package Day74DoubtSession;

import java.util.HashMap;

public class PathSum3UsingMap {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int count = 0;
    public HashMap<Long, Integer> map; // Use long to avoid overflow issues

    // In-order traversal method for testing
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Helper method for calculating the path sums
    public void helper(Node root, long currSum, int targetSum) {
        if (root == null) {
            return;
        }

        // Check if there is a previous sum that matches the current sum minus the target sum
        if (map.containsKey(currSum - targetSum)) {
            count += map.get(currSum - targetSum); // Add to count if path sum is found
        }

        // If current sum equals target sum, it's a valid path
        if (currSum == targetSum) {
            count++;
        }

        // Store the current sum in the map with its frequency
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        // Recurse on left and right subtrees
        helper(root.left, currSum + root.data, targetSum);
        helper(root.right, currSum + root.data, targetSum);

        // Backtrack: remove the current sum from the map as we go back up the recursion stack
        map.put(currSum, map.get(currSum) - 1);
    }

    // Method to initiate the pathSum calculation
    public int pathSum(Node root, int targetSum) {
        if (root == null) {
            return 0;
        }

        // Initialize the map and count
        map = new HashMap<>();
        count = 0;

        // Start the helper method from the root
        helper(root, 0, targetSum);

        // Recurse on left and right subtrees of the current root to check for paths starting from those nodes
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }

    public static void main(String[] args) {
        // Construct the binary tree
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(2);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(9);
        root.left.left.right = new Node(4);
        root.left.right.left.left = new Node(1);

        // Print in-order traversal for testing
        inorder(root);
        System.out.println();

        // Create an instance of PathSum3UsingMap and call the pathSum method
        PathSum3UsingMap obj = new PathSum3UsingMap();
        System.out.println("Number of paths with sum 8: " + obj.pathSum(root, 8));
    }
}
