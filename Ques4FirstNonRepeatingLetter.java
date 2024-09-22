// package Day53Queue;

import java.util.*;

public class Ques4FirstNonRepeatingLetter {
    public static void printNonrepeating(String str) {
        int freq[] = new int[26]; // Frequency array for each letter
        Queue<Character> q = new LinkedList<>(); // Queue to maintain order

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++; // Increment the frequency of the character

            // Remove characters from the queue that are repeating
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // Print the first non-repeating character or -1 if none exists
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonrepeating(str);
    }
}
