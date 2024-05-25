import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();

        int fact =1; //hold the fatorial
        for(int i=1; i<=num; i++){
            fact *= i;


        }
        System.out.println("factorial : " + fact);
    }
}
