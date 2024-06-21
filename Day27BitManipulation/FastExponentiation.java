package Day27BitManipulation;

public class FastExponentiation {
    public static int faxtExpo(int a, int n){
        int ans =1;
         while(n > 0){
            if((n & 1) != 0){ //check LSB
                ans= ans *a;
            }
            a = a*a; //Update
            n = n >> 1; //right shift

         }
         return ans;
    }
    public static void main(String[] args) {
        int a = 2, n = 5;
        System.out.println(faxtExpo(a, n));

    }
}
