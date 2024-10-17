package Day63BinaryTree3Live;

public class MaxPathSum {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    int diameter = Integer.MIN_VALUE;
    public int height(Node root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        if(lh < 0) lh=0;
        if(rh < 0) rh=0;
        diameter = Math.max(diameter, lh + rh + root.data); 

        return Math.max(lh, rh) + root.data;
    }
    public int maxPathSum(Node root){
        height(root);
        return diameter;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        MaxPathSum maxPathSum = new MaxPathSum();
        System.out.println(maxPathSum.maxPathSum(root));
        
    }
}
