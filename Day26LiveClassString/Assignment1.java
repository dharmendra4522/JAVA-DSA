package Day26LiveClassString;

import java.util.Scanner;

public class Assignment1 {
    public static int findlowerCaseVowelCount(String str) {
        int len = str.length();
        int vowelCount =0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if(Character.isLowerCase(ch) == true){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Strings: ");
        String str = sc.nextLine();

        int vowelCount = findlowerCaseVowelCount(str);

        System.out.println("Number of Vowels is: "+vowelCount);
    }
}
