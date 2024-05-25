import java.util.*;

public class Program13PrimeNumber {
    public static void main(String[] args) {
        // check Prime Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2) {
            System.out.println("N is prime");
        } else {
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if (n % i == 0) { // n is multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is prime ");
            } else {
                System.out.println("n is not prime");
            }
        }
    }
}
