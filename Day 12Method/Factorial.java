package Day12Method;

public class Factorial {
    
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f = f * i;

        }
        return f;  // factorial of 
        
    }
    public static void main(String[] args) {
       int fab =  factorial(4);
       System.out.println(fab);
       System.out.println(factorial(7));
       
    }
}
