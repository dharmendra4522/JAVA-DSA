package Day35LiveRecursion;

public class FibonacciNumber {
    public static int fibonacciNumber(int n) {
        // base case
        if (n == 0 ||  n == 1) {
            return n;
        } else{
            return fibonacciNumber(n-1) + fibonacciNumber(n-2);
        }


        // //without resursion
        // int f0 = 0;
        // int f1 = 1;

        // for (int i = 2; i <= n; i++) {
        //     int currf = f0 + f1;
        //     f0 = f1;
        //     f1 = currf;
        //     System.out.println("F" + i + " " + currf);
        // }
    }

    public static void main(String[] args) {
         System.out.println(fibonacciNumber(10));
       

    }
}
