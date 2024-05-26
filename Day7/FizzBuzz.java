package Day7;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    if(num % 3 == 0 && num % 5 != 0)
    {
        //multiple of 3
        System.out.println("Fizz");
    } 
    else if(num % 5 == 0 && num % 3 != 0)
    {
        //multiple of 5
        System.out.println("Buzz");
    } 
    else if(num % 3 == 0 && num % 5 == 0)
    {
        //multiple of 3 and 5
        System.out.println("FizzBuzz");
    } 
    else
    {
        System.out.println(num);
    }
}
}

