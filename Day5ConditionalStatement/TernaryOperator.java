package Day5ConditionalStatement;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 4;


        //`ternary operator
        String type = ((number%2==0) ? "even" : "odd");
        System.out.println(type);
    }
}