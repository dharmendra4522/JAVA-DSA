package Day59Tree2;

public class DiameterOfTreeApproach2 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){ //O(n)
        if(root==null){
            return new Info(0,0);
        }
        Info leftIfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftIfo.diam, rightInfo.diam), leftIfo.ht + rightInfo.ht +1);
        int ht = Math.max(leftIfo.ht,rightInfo.ht )+1;
        return new Info(diam, ht);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


       Info result = diameter(root); // Store the result in a variable
        System.out.println("Diameter of the tree: " + result.diam); // Output the diameter of the tree
    }
}
