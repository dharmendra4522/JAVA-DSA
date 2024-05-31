package Day14Live;

public class Question5 {
    //write a java method to computer the sum of he digits in an integer

    public static int sumOfDigit (int num){
        int sum = 0;

        while(num > 0){
            //retrive last digit
            int lastDigit = num%10;

            //delete last digit
            num = num/10;

            //add this digit to sum
            sum = sum + lastDigit;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans = sumOfDigit(12345);
        System.out.println(ans);
    }

}
