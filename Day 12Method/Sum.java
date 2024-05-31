package Day12Method;
import java.util.*;
public class Sum {
    public static int calculateSum(int num1, int num2){ //parameters or formal parameters
        return num1+num2;
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);  //arguments or actual parameters
        System.out.println("Sum of : " + sum);
    }
}
