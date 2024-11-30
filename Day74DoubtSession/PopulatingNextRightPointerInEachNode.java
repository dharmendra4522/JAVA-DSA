package Day74DoubtSession;

public class PopulatingNextRightPointerInEachNode {
    static class Node{
        int data;
        Node left, right;
        Node next;

        public Node(int data){
            this.data = data;
            left = right = next = null;

        }
    }

    public Node connect(Node root){
        if(root == null){
            return root;
        }
        Node level_start = root;
        while(level_start != null){
            Node currTemp = level_start;

            while(currTemp != null){
                if(currTemp.left != null){
                    currTemp.left.next = currTemp.right;
                }
                if(currTemp.right != null && currTemp.next != null){
                    currTemp.right.next = currTemp.next.left;
                }
                currTemp = currTemp.next;
            }
            level_start = level_start.left;
        }
        return root;
    }

    // Helper function to print the tree level-wise with next pointers
    public void printTreeWithNextPointers(Node root) {
        Node level_start = root;
        while (level_start != null) {
            Node currTemp = level_start;
            while (currTemp != null) {
                System.out.print(currTemp.data + " -> ");
                if (currTemp.next != null) {
                    System.out.print(currTemp.next.data + " ");
                } else {
                    System.out.print("null ");
                }
                currTemp = currTemp.next;
            }
            System.out.println();
            level_start = level_start.left;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        PopulatingNextRightPointerInEachNode obj = new PopulatingNextRightPointerInEachNode();
        obj.connect(root);

        // Print tree with next pointers
        obj.printTreeWithNextPointers(root);
    }
}
