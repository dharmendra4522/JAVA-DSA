package Day56Tree;
import java.util.*;

public class LevelOrder {
    // Node class to represent each node of the binary tree
    static class Node {
        int data; // value of the node
        Node left; // reference to the left child
        Node right; // reference to the right child
        
        // Constructor to initialize the node with data
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class for creating and performing operations on the binary tree
    static class BinaryTree {
        static int idx = -1; // global index for traversing the nodes array

        // Method to build the binary tree from an array
        public static Node buildTree(int nodes[]) {
            idx++; // increment the index to access the next node
            // If the node value is -1, it represents a null node (i.e., no child)
            if (nodes[idx] == -1) {
                return null;
            }
            // Create a new node with the current value from the array
            Node newNode = new Node(nodes[idx]);
            // Recursively build the left subtree
            newNode.left = buildTree(nodes);
            // Recursively build the right subtree
            newNode.right = buildTree(nodes);
            return newNode; // return the newly created node
        }

        // Method to perform level order traversal (breadth-first traversal) of the binary tree
        public static void levelOrder(Node root) {
            if (root == null) {
                return; // If the tree is empty, return
            }

            // Queue to hold nodes for level order traversal
            Queue<Node> queue = new LinkedList<>();
            queue.add(root); // Start with the root node
            queue.add(null); // Add a null marker to signify the end of a level

            // Loop until the queue is empty
            while (!queue.isEmpty()) {
                Node currNode = queue.remove(); // Remove the front node from the queue

                if (currNode == null) {
                    // If we encounter a null, it means we have reached the end of the current level
                    System.out.println(); // Print a new line to separate levels
                    if (queue.isEmpty()) {
                        // If the queue is empty, we've completed the traversal
                        break;
                    } else {
                        // Otherwise, add another null to mark the next level
                        queue.add(null);
                    }
                } else {
                    // Print the current node's data
                    System.out.print(currNode.data + " ");
                    // If the current node has a left child, add it to the queue
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    // If the current node has a right child, add it to the queue
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Array to represent the binary tree structure. -1 indicates a null node.
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Create a binary tree instance
        BinaryTree tree = new BinaryTree();
        // Build the tree from the array of nodes
        Node root = tree.buildTree(nodes);
        // Perform level order traversal and print the nodes level by level
        tree.levelOrder(root);
    }
}
