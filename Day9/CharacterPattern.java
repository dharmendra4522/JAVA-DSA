package Day9;

public class CharacterPattern {

    public static void main(String[] args)

    {
        int n = 5;
        char ch = 'A';
        // outer loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }
}
