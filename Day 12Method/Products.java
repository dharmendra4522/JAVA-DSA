package Day12Method;

public class Products {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int prod = multiply(5,4);
        System.out.println("a * b = " + prod);
        int pro = multiply(20,4);
        System.out.println("a * b = " + pro);
    }
}
