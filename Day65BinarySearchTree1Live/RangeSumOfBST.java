package Day65BinarySearchTree1Live;
import java.util.*;

public class RangeSumOfBST {
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
    // public static int rangeSum(Node root, int min, int max){
    //     if(root == null) return 0;
    //     inorder(root.left, min, max);
    //     int sum = 0;
    //     if(root.data >= min && root.data <= max){
    //         sum += root.data;
    //     } 
    //     sum += rangeSum(root.left, min, max);
    //     sum += rangeSum(root.right, min, max);
    //     return sum;
    // }
    public int rangeSumBST(Node root, int min, int max){
        int sum =0;
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            int data = curr.data;
            if(data >= min && data <= max) {
                sum += data;
            }
            curr = curr.right;
        }
        return sum;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        System.out.print("Tree inorder: ");
        inorder(root);
        rangeSumBST(root, 5, 15);


    }
    
}
