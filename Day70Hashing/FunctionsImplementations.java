package Day70Hashing;

import java.util.*;

public class FunctionsImplementations {
    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of elements in the map
        private int N; // Number of buckets
        private LinkedList<Node>[] buckets; // Array of LinkedLists for buckets

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;  // Initial capacity
            this.buckets = new LinkedList[4];  // Create an array of LinkedLists
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();  // Initialize each bucket as an empty LinkedList
            }
        }

        // Hash function to calculate the bucket index
        private int hashFunction(K key) {
            int hc = key.hashCode();  // Get the hashCode of the key
            return Math.abs(hc) % N;  // Calculate the bucket index based on the hashCode
        }

        // Search the linked list at a given bucket index for a key and return the index of the key in the list
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];  // Get the linked list at the given bucket index
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);  // Get each node in the linked list
                if (node.key.equals(key)) {  // Use .equals() instead of == to compare objects
                    return i;  // Return the index of the node in the list if the key matches
                }
            }
            return -1;  // Return -1 if the key is not found
        }

        // Rehash the hash map to double the bucket size when the load factor exceeds a threshold
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;  // Save the old buckets
            buckets = new LinkedList[N * 2];  // Create a new bucket array with double the size
            N = N * 2;  // Update the bucket size

            // Reinitialize the new buckets array
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();  // Initialize each bucket as an empty LinkedList
            }

            // Rehash all nodes from the old buckets to the new buckets
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    int bi = hashFunction(node.key);  // Recalculate bucket index for each node
                    buckets[bi].add(node);  // Add node to the new bucket based on the recalculated index
                }
            }
        }

        // Put a key-value pair into the hash map
        public void put(K key, V value) {
            int bi = hashFunction(key);  // Get the bucket index using the hash function
            int di = searchInLL(key, bi);  // Search for the key in the linked list of the corresponding bucket

            // If the key is already present, update the value
            if (di != -1) {
                Node node = buckets[bi].get(di);  // Get the existing node
                node.value = value;  // Update the value of the existing node
            } else {
                // If the key is not found, add a new node with the key-value pair
                buckets[bi].add(new Node(key, value));
                n++;  // Increase the number of elements in the map
            }

            // Check load factor and rehash if needed
            double loadFactor = (double) n / N;
            if (loadFactor > 2.0) {  // If load factor exceeds 2.0, trigger rehashing
                rehash();
            }
        }

        // Check if the key exists in the hash map
        public boolean containsKey(K key) {
            int bi = hashFunction(key);  // Get the bucket index using the hash function
            int di = searchInLL(key, bi);  // Search for the key in the corresponding bucket
            return di != -1;  // Return true if the key is found, false otherwise
        }

        // Remove a key-value pair from the hash map and return the value
        public V remove(K key) {
            int bi = hashFunction(key);  // Get the bucket index using the hash function
            int di = searchInLL(key, bi);  // Search for the key in the corresponding bucket
            if (di != -1) {
                Node node = buckets[bi].remove(di);  // Remove the node from the linked list
                n--;  // Decrease the number of elements
                return node.value;  // Return the value of the removed node
            }
            return null;  // Return null if the key is not found
        }

        // Get the value associated with a key
        public V get(K key) {
            int bi = hashFunction(key);  // Get the bucket index using the hash function
            int di = searchInLL(key, bi);  // Search for the key in the corresponding bucket
            if (di != -1) {
                Node node = buckets[bi].get(di);  // Get the node if found
                return node.value;  // Return the value of the node
            }
            return null;  // Return null if the key is not found
        }

        // Get a list of all keys in the hash map
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            // Loop through all the buckets
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];  // Get the linked list at the given bucket index
                for (Node node : ll) {
                    keys.add(node.key);  // Add the key of each node to the keys list
                }
            }
            return keys;  // Return the list of all keys
        }

        // Check if the hash map is empty
        public boolean isEmpty() {
            return n == 0;  // Return true if the map has no elements
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Nepal", 5);

        // Print all keys in the hash map
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);  // Output: India, China, USA, Nepal
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
