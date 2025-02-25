import java.util.HashMap;

public class HouseRobaber3 {

    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                this.left = left;
                 this.right = right;
            }
         }
class Solution {
    static int rec(TreeNode curr, HashMap<TreeNode, Integer> dp){
        if(curr == null){
            return 0;
        }
        if(dp.containsKey(curr) == true){
            return dp.get(curr);
        }
        int dontSteal = rec(curr.left, dp) + rec(curr.right, dp);
        
        int steal = curr.val;
        if(curr.left!=null){
            steal += rec(curr.left.left, dp) + rec(curr.left.right, dp);
        }
        if(curr.right!=null){
            steal += rec(curr.right.left, dp) + rec(curr.right.right, dp);
        }
        int val = Math.max(dontSteal, steal);
        dp.put(curr, val);
        return val;

    }
    public int rob(TreeNode root) {
        HashMap<TreeNode, Integer> dp = new HashMap<>();
        return rec(root, dp);
    }
}
}