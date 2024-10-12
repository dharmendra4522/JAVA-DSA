package Day59Tree2;
import java.util.*;

public class TopViewOfTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int root) {
            this.data = root;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd; // horizontal distance from the root

        public Info(Node node, int hd) { // Fixed constructor syntax
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // Using a queue for level order traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>(); // To store the first node at each horizontal distance

        int min = 0, max = 0; // Variables to track the minimum and maximum horizontal distance
        q.add(new Info(root, 0)); // Start with the root node at horizontal distance 0
        q.add(null); // Marker for the end of the current level

        while (!q.isEmpty()) {
            Info curr = q.remove(); // Remove the front element from the queue
            
            if (curr == null) { // Check for the level separator
                if (!q.isEmpty()) {
                    q.add(null); // Add a new level separator if the queue is not empty
                }
                continue; // Skip to the next iteration
            }

            // If the horizontal distance is not already present, add it to the map
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            // Process the left child
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1)); // Left child has hd - 1
                min = Math.min(min, curr.hd - 1); // Update minimum hd
            }

            // Process the right child
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1)); // Right child has hd + 1
                max = Math.max(max, curr.hd + 1); // Update maximum hd
            }
        }

        // Print the nodes from the map in horizontal order
        for (int i = min; i <= max; i++) { // Use <= to include the max value
            if (map.containsKey(i)) {
                System.out.print(map.get(i).data + " "); // Print the data of the nodes
            }
        }
        System.out.println(); // New line after printing the top view
    }

    public static void main(String[] args) {
        // Create the tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Call the topView function
        topView(root); // Output the top view of the tree
    }
}
