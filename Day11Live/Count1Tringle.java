package Day11Live;

public class Count1Tringle{
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print(row);
                } else {
                    System.out.print("");
                }

            }
            System.out.println();

        }
    }
}
