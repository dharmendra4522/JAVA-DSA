package Day75TriesPractice;

public class ImplementTries {

    static class TrieNode{
        TrieNode[] children;
        boolean isEnd;

        public TrieNode(){
            children = new TrieNode[26];
            isEnd = false;
        }
    }

    private TrieNode root;
    private ImplementTries() {
        root = new TrieNode();
    }
    //insertion
    public void insert(String word){
        TrieNode temp = root; //start from the root node
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int idx = ch-'a';
            if(temp.children[idx] == null){
                temp.children[idx] = new TrieNode();
            }
            temp = temp.children[idx];
        }
        temp.isEnd= true;
    }

    public boolean search(String word){
        TrieNode temp = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(temp.children[idx] == null){
                return false;
            }
            temp= temp.children[idx];
        }
        return temp.isEnd;
    }

    public boolean startWith(String word){
        TrieNode temp = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) -'a';
            if(temp.children[idx] == null){
                return false;
            }
            temp = temp.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        ImplementTries trie = new ImplementTries();
        String word[] = {"appl","app", "ap","apple","apply"};
        String Search = "apply";
        for(String w:word){
            trie.insert(w);

        }

        //print tries nodes
        for(int i=0; i<word.length; i++){
            System.out.println((word[i]));
        }
        System.out.println("Words inserted successfully.");
        System.out.println("Search for word apply");
        System.out.println(trie.search(Search));

        System.out.println("Start with Apply");
        System.out.println(trie.startWith("apply"));
    }

}