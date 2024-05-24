package Day5ConditionalStatement;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult: Vote, Drive");
        }
         else {
            System.out.println("Not Adult");
        }
    }

}
