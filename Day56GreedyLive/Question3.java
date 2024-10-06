package Day56GreedyLive;

import java.util.Scanner;

public class Question3 {
    // Lexicographically smallest string of length N and sum
    // KWehavetwointegersNandK.ThetaskistoprintthelexicographicallysmalleststringoflengthNconsistingoflower-caseEnglishalphabetssuchthatthesumofthecharactersofthe
    // string equals to K where ‘a’ = 1, ‘b’ = 2, ‘c’ = 3, ..... and ‘z’ = 26
    public static String getSmallestString(int N, int K) {
        // Create a char array initialized with 'a' (smallest character)
        char[] result = new char[N];
        for (int i = 0; i < N; i++) {
            result[i] = 'a';
        }

        // Deduct the sum of N 'a' characters (each 'a' = 1)
        K -= N;

        // Traverse from the last position to adjust characters to meet the sum K
        int i = N - 1;
        while (K > 0) {
            // Calculate the value to add to the current character
            int add = Math.min(K, 25); // Max we can add is 25 ('z' - 'a')
            result[i] += add;
            K -= add; // Reduce K by the value we added
            i--;
        }

        return new String(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length N: ");
        int N = sc.nextInt();
        System.out.print("Enter sum K: ");
        int K = sc.nextInt();
        System.out.println("Lexicographically smallest string: " + getSmallestString(N, K));
        sc.close();
    }
}
