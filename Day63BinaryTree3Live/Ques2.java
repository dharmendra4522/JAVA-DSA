package Day63BinaryTree3Live;

public class Ques2 {
    static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static void invertTree(Node root){
        if(root == null){
            return ;
        }
        // Swap left and right children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);
        return ;

    }
    public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);    
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print("Preorder traversal of original tree: ");
        preOrder(root);
        
        invertTree(root);
        
        System.out.print("\nPreorder traversal of inverted tree: ");
        preOrder(root);

    }
}
