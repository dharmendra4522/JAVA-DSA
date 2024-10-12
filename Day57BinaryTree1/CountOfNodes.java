package Day56Tree;
import java.util.*;

public class CountOfNodes {
    static class Node{
        int data; 
        Node left, right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int count(Node root) {
        if(root == null){
            return 0;
        } 
        int lcount = count(root.left);
        int rcount = count(root.right);
        return lcount + rcount + 1;


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
        System.out.println("Count of nodes is " + count(root));
    }

}
