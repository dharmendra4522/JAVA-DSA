package Day1;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = scanner.nextInt();
        boolean isPrime = true; // Assume n is prime
        
        if (n <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    isPrime = false; // If divisible, n is not prime
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.err.println(n + " is not a prime number.");
        }
        
        scanner.close();
    }
}
