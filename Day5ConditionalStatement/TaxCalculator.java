package Day5ConditionalStatement;
import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enteer Your Income: ");
        int income = sc.nextInt();
        int tax;

        if(income < 50000){
            tax = 0;
        } else if (income <= 500000 && income <1000000) {
            tax = (int) (income * 0.2);
        } else{
            tax = (int) (income * 0.3);
        }
        System.out.println("Your Tax is: " + tax);
    }
    
}
