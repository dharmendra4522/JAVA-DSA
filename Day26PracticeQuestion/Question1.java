import java.util.*;

public class Question1 {
    public static int lowerCaseVowels(String str) {
        int count = 0;
        for (int i = 0;  i< str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello Sir hjrf kuhewfhl jfewhgn kuwhgr ";
        System.out.println(lowerCaseVowels(str));
    }
}
