package Day11Live;

import java.util.Scanner;

public class FloydsTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Star : ");
        int n=sc.nextInt();
        // int n = 5;
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print(count+" ");
                    count++;
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
