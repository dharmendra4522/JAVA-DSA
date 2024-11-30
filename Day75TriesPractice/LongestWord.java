package Day75TriesPractice;

import java.util.Arrays;

public class LongestWord {
    public class TrieNode {
        TrieNode[] children;
        boolean isEnd;
        String finalWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEnd = false;
            finalWord = "";
        }
    }

    private TrieNode root;
    private String ans;

    public LongestWord() {
        root = new TrieNode();
        ans = "";
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode temp = root; // Start from root
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int idx = c - 'a';
            if (temp.children[idx] == null) {
                temp.children[idx] = new TrieNode();
            }
            temp = temp.children[idx];
        }
        temp.isEnd = true;
        temp.finalWord = word;
    }

    // Find the longest word using DFS
    public void findLongest(TrieNode node) {
        if (node == null) return;

        if (node.isEnd) {
            if (node.finalWord.length() > ans.length() ||
                (node.finalWord.length() == ans.length() && node.finalWord.compareTo(ans) < 0)) {
                ans = node.finalWord;
            }
        }

        for (TrieNode child : node.children) {
            if (child != null && child.isEnd) {
                findLongest(child);
            }
        }
    }

    // Main method to find the longest word
    public String longestWord(String[] words) {
        Arrays.sort(words); // Optional sorting to ensure lexicographical order
        for (String word : words) {
            insert(word);
        }
        findLongest(root); // Start DFS from the root
        return ans;
    }

    public static void main(String[] args) {
        LongestWord trie = new LongestWord();
        String[] words = {"w", "wo", "wor", "worl", "world"};
        System.out.println("Longest Word: " + trie.longestWord(words)); // Output: "world"
    }
}
