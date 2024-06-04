package Array;

public class Passbyreference {
    static void change(int x){
        x=20;
    }
    public static void main(String[] args) {
        int x =10;
        System.out.println("Orignial X: "+x);
        change(x);
        System.out.println("new X: "+x);

    }
}
