package Day13PracticeQuestion;

import java.util.Scanner;

public class Question3 {
    public static boolean isPalindrom(int num){
        int palindrom = num;
        int reverse = 0;

        while (palindrom != 0) {
            int reminder = palindrom % 10;
            reverse = reverse * 10 + reminder;
            palindrom = palindrom / 10;
        }

        if (num == reverse){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(isPalindrom(a)){
            System.out.println("number : " + a + " is a Palindrom");
        } else{
            System.out.println("number : " + a + " is not a Palindrom");

        }

    }
}
