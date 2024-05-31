package Day13Live;

public class Question2 {
    // write a method named isEven that accepts an int argument. The method should
    // return true if the argument is even, or false. also write a program to test your method.
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    // public static boolean functionIsWorkingFineOrNot(){
    //     int num = 45;
    //     boolean ans = isEven(num);
    // }
    public static void main(String[] args) {
        System.out.println(isEven(45));
        System.out.println(isEven(40));

    }
}
