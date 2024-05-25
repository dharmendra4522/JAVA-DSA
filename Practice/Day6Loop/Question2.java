import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        int choice;
        int evenSum = 0;
        int oddSum =0;
        do{
            System.out.print("Enter the number: ");
            num = sc.nextInt();
            if(num % 2 == 0){
                evenSum += num;

            } else {
                oddSum += num;
            }
            System.out.print("Do you want to continue? Press 1 for yese or 0 for no ");
             
            choice = sc.nextInt();
        } while(choice ==1);
            System.out.println("Sum of even numbers : " + evenSum);
            System.out.println("Sum of odd numbers : " + oddSum);
        
    }
}
