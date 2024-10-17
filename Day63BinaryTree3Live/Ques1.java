package Day63BinaryTree3Live;

public class Ques1 {
    static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static boolean isUniValued(Node root){
        if(root == null){
            return true;
        }
        return isUnivaluedUtil(root, root.data);
    }
    public static boolean isUnivaluedUtil(Node root, int val){
        if(root == null){
            return true;
        }
        if(root.data != val){
            return false;
        }
        return isUnivaluedUtil(root.left, val) && isUnivaluedUtil(root.right, val);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(5);
        root.left.right = new Node(1);


        System.out.println(isUniValued(root));
    }
}
