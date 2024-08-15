package Day32Recursion;

public class Problem10 {

    //Print x^n in  O(log n)
    public static int optimizePower(int a, int n){
        if(n == 0){
            return 1;
        }
       int halfPoewr = optimizePower(a, n/2);
       int halfPowerSq = halfPoewr * halfPoewr;


       //n is odd
       if(n % 2 !=0){
        halfPowerSq = a* halfPowerSq;
       }
       return halfPowerSq;

    }
    public static void main(String[] args) {
        int a = 2;
        int n=10;
        System.out.println(optimizePower(a, n));
    }
}
