package Day54LivePractice;
import java.util.*;
//Given a number N. The task is to generate and print all binary numbers with decimal values from
// 1 to N.
public class Question1 {
    //Generate Binary Number
    public static void generateBinaryNumber(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
    
        while (n --> 0) {
            String s1 = q.peek();
            q.remove();
            System.out.print(s1 + " ");
    
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }    
    public static void main(String[] args) {
        int n = 10;
        generateBinaryNumber(n);
        
    }
}
