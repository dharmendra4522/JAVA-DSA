package Day27BitManipulation;

/**
 * BinaryAndOperator
 */
public class BitwiseOperators {

    public static void main(String[] args) {
        System.out.println("Binary And(&) Operator of (5 & 6): "+(5 & 6));
        System.out.println("Binary OR(|) Operator of (5 | 6) : "+(5 | 6));
        System.out.println("Binary XOR(^) Operator of (5 ^ 6): "+(5 ^ 6));
        System.out.println("Binary One's Complement(~) Operator of (~5): "+(~5));
        System.out.println("Binary One's Complement(~) Operator of (~0): "+(~0));
        System.out.println("Binary Left Shift(<<) Operator of (5 << 2): "+(5 << 2));
        System.out.println("Binary Right Shift(>>) Operator of (6 >> 1): "+(6 >> 1));
    }
}