package Day2;

import java.util.*;

// Area of a Square
public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of area: ");
        int side = sc.nextInt();
        int area = side * side;

        System.out.println("area of the square is : " + area);
    }
}
