package Day27BitManipulation;

public class OddOrEven {
    public static void oddorEven(int n){
        int bitMask = 1;
        if((n & bitMask)== 0){
            //even number
            System.out.println("Even number");
        } else{
            //odd number
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(11);
        oddorEven(14);
    }
}
