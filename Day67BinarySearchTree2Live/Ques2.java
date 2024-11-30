package Day67BinarySearchTree2Live;

public class Ques2 {
    class Node {
        int data;
        Node left, right;
        
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static int closestElement(Node root, int target) {
        if (root == null) return -1; // Handle case for empty tree
        
        int closest = root.data;
        while (root != null) {
            // Update closest if current node is closer to the target
            if (Math.abs(root.data - target) < Math.abs(closest - target)) {
                closest = root.data;
            }
            // Move left or right based on the target value
            if (target < root.data) {
                root = root.left;
            } else if (target > root.data) {
                root = root.right;
            } else {
                // If the current node's data equals the target
                break;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        Ques2 node = new Ques2();
        Node root = node.new Node(8);
        root.left = node.new Node(5);
        root.right = node.new Node(11);
        root.left.left = node.new Node(3);
        root.left.right = node.new Node(6);
        root.right.right = node.new Node(20);

        System.out.println("Closest element to 5: " + closestElement(root, 5));   // Output: 5
        System.out.println("Closest element to 19: " + closestElement(root, 19)); // Output: 20
    }
}
