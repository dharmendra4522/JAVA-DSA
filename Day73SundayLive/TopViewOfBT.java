package Day73SundayLive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.TreeMap;

public class TopViewOfBT {
    static class Node {
        int data; // Added data field to store node value
        Node left; // Left child
        Node right; // Right child

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Pair class to hold node and its horizontal distance
    static class Pair {
        Node node;
        int x;

        public Pair(Node node, int x) {
            this.node = node;
            this.x = x;
        }
    }

    static ArrayList<Integer> topView(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        // Initialize the queue with the root node at horizontal distance 0
        if (root != null) {
            Pair p = new Pair(root, 0);
            q.add(p);
        }

        while (!q.isEmpty()) { // Corrected method name from siz() to isEmpty()
            Pair pp = q.remove();
            int currX = pp.x;

            // If this horizontal distance is not already in the map, add it
            if (!map.containsKey(currX)) {
                map.put(currX, pp.node.data);
            }

            // Add left child to the queue with horizontal distance -1
            if (pp.node.left != null) {
                Pair left = new Pair(pp.node.left, currX - 1);
                q.add(left);
            }

            // Add right child to the queue with horizontal distance +1
            if (pp.node.right != null) {
                Pair right = new Pair(pp.node.right, currX + 1); // Fixed horizontal distance for right child
                q.add(right);
            }
        }

        // Prepare the result list from the map
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // Fixed the typo from ENtry to Entry
            ans.add(entry.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        
        ArrayList<Integer> topViewResult = topView(root);
        System.out.println(topViewResult); // Output the top view of the binary tree
    }
}