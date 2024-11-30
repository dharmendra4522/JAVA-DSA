package Day65BinarySearchTree1Live;

public class InvertBinaryTree {
    static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static Node invertBTree(Node root){
        if(root == null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertBTree(root.left);
        invertBTree(root.right);
        return root;

    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        

        System.out.print("Before Interchage: ");
        inorder(root);
        System.out.println();
        invertBTree(root);
        System.out.print("After Interchage: ");
        inorder(root);
    }
    
}
