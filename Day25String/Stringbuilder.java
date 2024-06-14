package Day25String;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // this method add the character to the last of the string
        }

        //O(26 * n^2)
        System.out.println(sb);
        System.out.println(sb.length());
    }

}
