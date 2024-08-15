package Day30OOPs;

/**
 * MethodOverloading
 */
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(3, 5)); 
        System.out.println(calc.sum((float)3.6, (float)5.0)); 
        System.out.println(calc.sum(3, 5, 6)); 
    }
    
}
class Calculator{
    int sum (int a, int b){
        return a+b;
    }
     float sum (float a, float b){
            return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
}