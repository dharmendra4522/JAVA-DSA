package Day13PracticeQuestion;
import java.util.Scanner;
public class Question2 {
    public static boolean isEven(int n){
        if (n % 2 ==0){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
       if(isEven(x)){
        System.out.println("The Number " + x + " is even");
       }
       else{
        System.out.println("The Number " + x + " is odd");
       }
       sc.close();
    }
}
