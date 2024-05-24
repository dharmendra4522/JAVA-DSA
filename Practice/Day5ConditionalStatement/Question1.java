package Day5ConditionalStatement;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("It's Positive Number ");
        } else {
            System.out.println("It's not Positive Number ");
        }
    }
}
