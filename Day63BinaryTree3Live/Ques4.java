package Day63BinaryTree3Live;

import java.util.*;

public class Ques4 {
    // HashMap to store the serialized subtree strings and their counts
    static HashMap<String, Integer> m;

    static class Node {
        int data;
        Node left, right;

        // Constructor to initialize a node with given data
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to serialize the tree in inorder fashion and find duplicates
    static String inorder(Node root) {
        if (root == null) return "";

        // Serialize the left subtree, current node, and right subtree
        String str = "(";
        str += inorder(root.left);
        str += Integer.toString(root.data);
        str += inorder(root.right);
        str += ")";

        // If this serialized subtree has been seen once before, it’s a duplicate
        if (m.get(str) != null && m.get(str) == 1) {
            System.out.print(root.data + " "); // Print the root data of duplicate subtree
        }
        
        // Update the count of this serialized subtree in the HashMap
        m.put(str, m.getOrDefault(str, 0) + 1);
        return str;
    }

    // Function to initialize the process of finding duplicate subtrees
    static void printAllDups(Node root) {
        m = new HashMap<>(); // Initialize the HashMap
        inorder(root); // Start the inorder traversal and serialization
    }

    // Function to find duplicate subtrees and return them as a list
    public List<Node> findDuplicateSubtrees(Node root) {
        // Map to store the serialized subtree strings and their corresponding nodes
        Map<String, List<Node>> map = new HashMap<>();
        List<Node> res = new ArrayList<>();
        
        // Helper function to serialize and store duplicate subtrees
        serializeAndFindDuplicates(root, map, res);
        return res; // Return the list of duplicate subtrees
    }

    // Helper function to serialize the tree and find duplicates
    private String serializeAndFindDuplicates(Node root, Map<String, List<Node>> map, List<Node> res) {
        if (root == null) return "#"; // Use "#" to denote null nodes

        // Serialize the subtree
        String serialized = root.data + "," + serializeAndFindDuplicates(root.left, map, res) + "," + serializeAndFindDuplicates(root.right, map, res);
        
        // If this serialized subtree has been seen once before, add it to the result
        if (map.containsKey(serialized)) {
            if (map.get(serialized).size() == 1) {
                res.add(map.get(serialized).get(0)); // Add to result only the first time it's seen as duplicate
            }
            map.get(serialized).add(root); // Add the current root to the list of this subtree
        } else {
            map.put(serialized, new ArrayList<>(Arrays.asList(root))); // Initialize with current root
        }
        
        return serialized; // Return the serialized string
    }

    public static void main(String[] args) {
        // Example tree construction
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        root.left.right.left = new Node(4); // Added left child to the second '2'
        root.right.left = new Node(4);
        root.right.right = new Node(4);

        // Print duplicates using the first method
        System.out.print("Duplicate subtree roots (method 1): ");
        printAllDups(root);
        System.out.println();

        // Find duplicates using the second method
        Ques4 question = new Ques4();
        List<Node> duplicates = question.findDuplicateSubtrees(root);
        System.out.print("Duplicate subtree roots (method 2): ");
        for (Node node : duplicates) {
            System.out.print(node.data + " ");
        }
    }
}
