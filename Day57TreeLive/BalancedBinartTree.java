package Day57TreeLive;

public class BalancedBinaryTree {

    // Custom node definition for binary tree
    static class Node {
        int data;
        Node left;  // Left child node
        Node right; // Right child node
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    boolean isTreeBalanced;

    public int dfs(Node root) {
        if (root == null) return 0;

        int lh = dfs(root.left); // Left subtree height
        int rh = dfs(root.right); // Right subtree height

        if (Math.abs(lh - rh) > 1) {
            isTreeBalanced = false; // If heights differ by more than 1, mark as unbalanced
        }

        return Math.max(lh, rh) + 1; // Return the height of the tree rooted at this node
    }

    public boolean isBalanced(Node root) {
        isTreeBalanced = true; // Initialize as true
        dfs(root);
        return isTreeBalanced; // Return the final result
    }

    public static void main(String[] args) {
        // Example usage
        BalancedBinaryTree solution = new BalancedBinaryTree();

        // Create a sample tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Check if the tree is balanced
        System.out.println(solution.isBalanced(root)); // Should return true
    }
}
