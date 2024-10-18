package Day64BinarySearchTree1;

public class DeleteBST {
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
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        } else{
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                root = null;
                return root;
            }
            //case 2 - one child
            if(root.left == null){
                return root.right; 
            } else if(root.right == null){
                return root.left;
            }
                //case 3 - two children
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int vlaues[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<vlaues.length; i++){
            root = insert(root, vlaues[i]);
        }
        inorder(root);
        System.out.println();
        root = delete(root, 5);
        System.out.println();
        inorder(root);

    }

    

}
