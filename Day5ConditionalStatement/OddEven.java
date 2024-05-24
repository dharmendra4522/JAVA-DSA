package Day5ConditionalStatement;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
     int a = sc.nextInt();
     if(a%2==0){
        System.out.println("Even number");
     }   
     else{
        System.out.println("Odd number");
     }
    }
    
}
