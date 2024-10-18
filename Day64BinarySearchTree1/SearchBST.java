package Day64BinarySearchTree1;

public class SearchBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static boolean search(Node root, int key){
        if(root ==null){
            return false;
        }
        if(root.data  > key){
            return search(root.left, key);
        } else if(root.data < key){
            return search(root.right, key);
        } else{
            return true;
        }
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);

        inorder(root);
        System.out.println();
        if(search(root, 7)){
            System.out.println("Element found");
        } else{
            System.out.println("Element not found");
        }

        System.out.println(search(root, 10)); // true
        System.out.println(search(root, 6)); // true
        System.out.println(search(root, 7));



    }
}
