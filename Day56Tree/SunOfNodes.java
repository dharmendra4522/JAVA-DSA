package Day56Tree;

public class SunOfNodes {
    static class Node{
        int data; 
        Node left, right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int sum(Node root){
        if(root == null) {
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;

    }
    public static void main(String[] args) {
        // Construct the following binary tree:
        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  5 6  7 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Sum of nodes is " + sum(root));
    }
}
