package Day13PracticeQuestion;

import java.util.Scanner;

public class Question1 {
    public static double average(double a, double b, double c){

        return (a+b+c) / 3;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number: ");
       double a= sc.nextDouble();
       System.out.print("Enter Second number: ");
       double b= sc.nextDouble();
       System.out.print("Enter third number: ");
       double c= sc.nextDouble();

       System.out.println("Average Of third number is: " + average(a,b,c));

    }
}
