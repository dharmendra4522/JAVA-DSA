package Day14Live;

public class Question3 {
    //write a java program to check if a number is palindrome or not.

    
    public static int reversedNumber(int num){
        int reversedNumber = num%10;
        while(num != 0){
            int lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
        }
        return reversedNumber;
    }
    public static boolean checkPallindrome(int num){
        int reversedA = reversedNumber(num);
        if(reversedA == num){
            return true;

        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean ans = checkPallindrome(123321);
        System.out.println(ans);
    }

}
