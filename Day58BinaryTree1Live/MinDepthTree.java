package Day57TreeLive;

public class MinDepthTree {
    static class Node {
        int data;
        Node left;  // Updated type from int to Node
        Node right;  // Updated type from int to Node
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public int minDepth(Node root) {
        if (root == null) return 0;

        int ld = minDepth(root.left);
        int rd = minDepth(root.right);

        if (root.left == null) return rd + 1;
        if (root.right == null) return ld + 1;

        return Math.min(ld, rd) + 1;
    }

    public static void main(String[] args) {
        // Construct the following binary tree:
        //       10
        //     /    \
        //   20     30
        //  /   \      \
        // 40   50     60
        //  /  \          \
        // 70  80         90
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.left.left.left = new Node(70);
        root.left.left.right = new Node(80);
        root.right.right.right = new Node(90);

        MinDepthTree mdt = new MinDepthTree();
        System.out.println("Minimum depth of the tree: " + mdt.minDepth(root));
    }
}
