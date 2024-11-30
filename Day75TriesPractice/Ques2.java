package Day75TriesPractice;

public class Ques2 {
    private static class Node {
        private char data;
        private String word;
        private boolean isEnd;
        private Node[] children;

        public Node(char data) {
            this.data = data;
            this.children = new Node[26];
            this.isEnd = false;
            this.word = null;
        }
    }

    private Node root = new Node('/');
    private String ans = "";

    // Insert a word into the Trie
    public void insert(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (cur.children[idx] == null) {
                cur.children[idx] = new Node(word.charAt(i));
            }
            cur = cur.children[idx];
        }
        cur.isEnd = true;
        cur.word = word;
    }

    // Depth-first search for the longest word
    public void dfs(Node node) {
        if (node == null) return;

        if (node.word != null) {
            if (node.word.length() > ans.length() ||
                (node.word.length() == ans.length() && node.word.compareTo(ans) < 0)) {
                ans = node.word;
            }
        }

        for (int i = 0; i < 26; i++) {
            Node child = node.children[i];
            if (child != null && child.word != null) {
                dfs(child);
            }
        }
    }

    // Find the longest word that can be built one character at a time
    public String longestWord(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        for (String word : words) {
            insert(word);
        }
        dfs(root);
        return ans;
    }

    public static void main(String[] args) {
        Ques2 solve = new Ques2();
        String[] words = { "w", "wo", "wor", "worl", "world" };
        System.out.println(solve.longestWord(words)); 
    }
}
