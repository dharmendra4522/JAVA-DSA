package Day8;

public class Faibonachi {
    public static void main(String[] args) {
        int a = 1, b = 1;
        int n =5;
        for (int i = 3; i < n; i++) {
            int c = a + b;
            a=b;
            b=c;

        }
        System.out.println(b);
        
    }

}
