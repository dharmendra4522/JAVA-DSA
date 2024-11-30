
package Day72Trie;

public class CreationTrie {
   static  class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;

            }
            curr = curr.children[idx];
        } 
        return curr.eow;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };
        System.out.println("Trie created");
        for (String word : words) {
            insert(word);
            System.out.println("Word: " + word);
        }
        System.out.println("Search for 'the' : " + search("the"));
        System.out.println("Search for 'the' : " + search("thor"));

    }
}