package Day75TriesPractice;
import java.util.*;

public class Ques1 {
    static class Node {
        List<String> data; // Store original words
        Node[] children; // Trie children
        boolean eow; // End of word

        public Node() {
            data = new ArrayList<>();
            children = new Node[26];
            eow = false;
        }
    }

    static Node root;
    List<List<String>> ans;

    public Ques1() {
        root = new Node();
        ans = new ArrayList<>();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        // Insert all words into the Trie
        for (String word : strs) {
            insert(word);
        }
        // Collect grouped anagrams via DFS
        dfs(root);
        return ans;
    }

    private void insert(String word) {
        // Sort the word to use as the anagram key
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sortedWord = new String(charArray);

        Node curr = root;
        for (int i = 0; i < sortedWord.length(); i++) {
            int index = sortedWord.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }

        // Mark the end of the word and store the original word
        curr.eow = true;
        curr.data.add(word);
    }

    private void dfs(Node node) {
        if (node.eow) {
            ans.add(node.data); // Add the collected words as a group
        }

        // Recursively traverse all children
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                dfs(node.children[i]);
            }
        }
    }

    public static void main(String[] args) {
        Ques1 solution = new Ques1();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.print(group);
        }
    }
}
