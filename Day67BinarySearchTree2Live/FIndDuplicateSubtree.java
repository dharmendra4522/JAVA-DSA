package Day67BinarySearchTree2Live;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FindDuplicateSubtree {
    // Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
    // Helper method to perform DFS and serialize subtrees
    static String dfs(TreeNode root, HashMap<String, Integer> mp, List<TreeNode> ans) {
        if (root == null) {
            return "#"; // Base case for null nodes
        }
        // Serialize left and right subtrees
        String left = dfs(root.left, mp, ans);
        String right = dfs(root.right, mp, ans);

        // Create the serialization for the current subtree
        String st = left + "," + right + "," + root.val;

        // Check for duplicates
        if (mp.containsKey(st)) {
            if (mp.get(st) == 1) {
                ans.add(root); // Add the root of the duplicate subtree
            }
            mp.put(st, mp.get(st) + 1); // Increment the count
        } else {
            mp.put(st, 1); // Initialize count for this serialization
        }

        return st; // Return the serialization
    }

    // Main method to find duplicate subtrees
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        dfs(root, map, ans); // Start DFS traversal
        return ans; // Return the list of duplicate subtrees
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Constructing a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        FindDuplicateSubtree finder = new FindDuplicateSubtree();
        List<TreeNode> duplicates = finder.findDuplicateSubtrees(root);

        // Print the values of duplicate subtrees
        for (TreeNode node : duplicates) {
            System.out.println("Duplicate Subtree Root Value: " + node.val);
        }
    }
}