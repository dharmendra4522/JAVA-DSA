package Day13PracticeQuestion;
import java.util.*;
public class Question5 {
    public static int sumOfDigit(int n){
        int sumDigit = 0;
        while(n>0){
            int lastdigit = n % 10;
            sumDigit += lastdigit;
            n = n/10;
        }
        return sumDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit = sc.nextInt();
        System.out.println(sumOfDigit(digit));

    }
}
