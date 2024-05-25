import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // print sum of first natural number using while loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.print("sum is : " + sum);
    }    
}
