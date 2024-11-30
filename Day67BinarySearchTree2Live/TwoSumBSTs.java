package Day67BinarySearchTree2Live;
import java.util.*;

/**
 * TwoSumBSTs
 */
public class TwoSumBSTs {
    static class Node {
        int data; 
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root, List<Integer> val) {
        if (root == null) return;
        inorder(root.left, val);
        val.add(root.data);
        inorder(root.right, val);
    }

    public int twoSumBSTs(Node root1, Node root2, int x) {
        List<Integer> val1 = new ArrayList<>();
        List<Integer> val2 = new ArrayList<>();
        
        // Get sorted values from both trees
        inorder(root1, val1);
        inorder(root2, val2);
        
        // Use two pointers to find pairs that sum to x
        int count = 0, i = 0, j = val2.size() - 1;
        
        while (i < val1.size() && j >= 0) {
            int currSum = val1.get(i) + val2.get(j);
            if (currSum == x) {
                count++;
                System.out.println("Pair found: (" + val1.get(i) + ", " + val2.get(j) + ")");

                i++;
                j--;
            } else if (currSum < x) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Construct the first BST
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);
    
        // Construct the second BST
        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);
    
        int x = 16;
    
        TwoSumBSTs solution = new TwoSumBSTs();
        int result = solution.twoSumBSTs(root1, root2, x);
        System.out.println("Total painrs: "+result); // Output: 3
    }
}
