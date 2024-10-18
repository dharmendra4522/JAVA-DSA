package Day64BinarySearchTree1;

public class BuildBST {
    static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;

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
        int vlaues[] = {10, 5, 1, 3, 4, 8, 9, 2, 7};
        Node root = null;

        for(int i=0; i<vlaues.length; i++){
            root = insert(root, vlaues[i]);
        }
        inorder(root);
        System.out.println();
    }
}
