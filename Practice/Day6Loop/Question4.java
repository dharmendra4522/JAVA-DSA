import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        //print table
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int mul = sc.nextInt();
        
        for(int i = 1; i<=10; i++){
            System.out.println(mul + " * " + i + " = " + mul*i);
        }
        
    }
}
