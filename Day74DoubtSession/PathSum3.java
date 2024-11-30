package Day74DoubtSession;

public class PathSum3 {
    static class Node{
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
            left = right = null;

        }

    }

    int count_of_path = 0;
    public int pathSum(Node root, int targetSum){
        if(root == null) return 0;

        pathSumHelper(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count_of_path;
    }
    public void pathSumHelper(Node root, int targetSum, int currSum){
        if(root == null) return;

        currSum += root.data;
        if(currSum == targetSum) {
            count_of_path++;
        }
        pathSumHelper(root.left, targetSum, currSum);
        pathSumHelper(root.right, targetSum, currSum);

    }
    public void printTree(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);

    }
    public static void main(String[] args) {
        PathSum3 pathSum3 = new PathSum3();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(-3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(-2);
        root.left.right.right = new Node(1);
        pathSum3.printTree(root);
        System.out.println();
        System.out.println("There are : "+pathSum3.pathSum(root, 8)+ " Paths");
    }
}
