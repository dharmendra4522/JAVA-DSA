package Day35LiveRecursion;

public class Question2 {
    static String[] arr ={"zero", "one", "two","three", "four", "five", "six","seven","eight","nine"};
    public static void prinDigit(int num){
        if(num==0){
            return;
        }
        int lastDigit= num%10;
        prinDigit(num/10);
        System.out.print(arr[lastDigit]+" ");

    }
    public static void main(String[] args) {
        prinDigit(1234);
    }
}
