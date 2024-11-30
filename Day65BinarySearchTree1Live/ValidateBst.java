package Day65BinarySearchTree1Live;

public class ValidateBst {
    // TreeNode class represents each node in the tree
    public class TreeNode {
        Object data; // Data stored in the node
        TreeNode left; // Left child
        TreeNode right; // Right child

        public TreeNode(Object data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Tree class represents the binary tree
    public class Tree {
        TreeNode root; // Root node of the tree
        boolean flag; // Indicates if the tree is a valid BST
        int prevVal; // Stores the value of the previous node in in-order traversal
        boolean isPrevVal; // Tracks if we have set the previous value

        public Tree(Object rootData) {
            this.root = new TreeNode(rootData);
            this.flag = true; // Initially assume the tree is valid
        }
    }

    // Method to create a specific tree structure for testing
    public void CreateNode1(Tree tree) {
        TreeNode temp = tree.root;
        temp.left = new TreeNode(1); // Left child of root
        temp.right = new TreeNode(4); // Right child of root
        TreeNode curr = temp.right;
        curr.left = new TreeNode(3); // Left child of node 4
        curr.right = new TreeNode(6); // Right child of node 4
        TreeNode c = temp.left;
        c.right = new TreeNode(100); // Right child of node 1
    }

    // Method to validate if a tree is a BST using in-order traversal
    public boolean isValidBst(TreeNode root, Tree tree) {
        if (root != null) {
            // Traverse the left subtree
            if (!isValidBst(root.left, tree)) {
                return false; // If left subtree is invalid, no need to continue
            }

            // Check current node
            if (!tree.isPrevVal) {
                tree.prevVal = (int) root.data; // Set the previous value for the first node
                tree.isPrevVal = true; // Now we have a previous value
            } else {
                // If current node's value is not greater than previous value, it's not a BST
                if ((int) root.data <= tree.prevVal) {
                    tree.flag = false; // Set flag to false indicating it's not a BST
                    return false; // Exit early
                }
                tree.prevVal = (int) root.data; // Update previous value for next comparison
            }

            // Traverse the right subtree
            return isValidBst(root.right, tree);
        }
        return true; // Return true for null nodes
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        ValidateBst validateBst = new ValidateBst();
        Tree tree = validateBst.new Tree(5); // Create a new tree with root value 5
        
        validateBst.CreateNode1(tree); // Create nodes for the tree
        tree.isPrevVal = false; // Reset previous value tracking
        tree.flag = true; // Reset flag for valid BST check

        // Validate the BST
        validateBst.isValidBst(tree.root, tree);
        System.out.println("Is valid BST: " + tree.flag); // Output the result
    }
}
