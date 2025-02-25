package Day81GraphPracticeQs;

import java.*;

public class Ques2 {

    static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;

        }
    }
    static class qItem{
        Node node;
        int depth;

        public qItem(Node node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }
    static int minDepth(Node root){
        if(root == null) return 0;
        Queue<qItem> q = new LinkedList<>();
        qItem qi = new qItem(root,1);
        q.add(qi);
        while(!q.isEmpty()){
            qi = q.peek();

        }

    }

}