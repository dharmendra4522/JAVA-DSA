package Day27BitManipulation;

public class OperationClearIthBit {
    public static int clearIthBit(int n, int i){
        int bitMarks = ~(1<<i);
        return n & bitMarks;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
}
