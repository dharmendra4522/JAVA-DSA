package Day25String;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        char arr[]= {'a', 'b','c','d'};

        String str = "abcd";
        String str2 = new String("xyz@#1234");

    // String are IMMUTABLE in java.

    // String input 

    Scanner sc = new Scanner(System.in);

    String name;
    // name = sc.next();  //This method only take one string (word)
    name = sc.nextLine();

    System.out.println(name);

    }
}
