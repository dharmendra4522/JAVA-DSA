package Day72Trie;

public class StartWIth {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node current = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(current.children[idx] == null){
                current.children[idx] = new Node();

            }
            current = current.children[idx];
        }
        current.eow = true;
    }

    public static boolean startWith(String prefix){ //O(n)
        Node current = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(current.children[idx] == null){
                return false;
            }
            current = current.children[idx];

        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app","mango","man","woman"};
        String prefie1 = "app";
        String prefie2 = "moon";
        for(String word : words){
            insert(word);
        }
        System.out.println(startWith(prefie1)); // true
        System.out.println(startWith(prefie2)); // false

    }
}
