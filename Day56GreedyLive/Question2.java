package Day56GreedyLive;

public class Question2 {
    public static int kthOdd(int L, int R, int K) {
        int totalNumbers = R - L + 1;
        int numberOfOddNumbers;

        if (L % 2 != 0 && R % 2 != 0) {
            numberOfOddNumbers = (totalNumbers / 2) + 1;
        } else {
            numberOfOddNumbers = (totalNumbers / 2);
        }
        if (K > numberOfOddNumbers) {
            return 0; // we don't have enough add numbers
        }

        int largest_value;
        if (R % 2 != 0) {
            largest_value = R;
        } else {
            largest_value = R - 1;

        }
        return largest_value -(2 * (K - 1));
    }

    public static void main(String[] args) {
        // int[] p ={-10, 10};
        int k = 4;
        int L = -3;
        int R = 3;
        System.out.println(kthOdd(L, R, k));

    }
}