package Day12Method;

public class Overloading {
     //func to calc sun of 2 numbers
   public static int sum(int a, int b){
    return a + b;
   }
   //func to calc sun of 2 numbers
   //overloading using Parameter
   public static int sum(int a, int b, int c){
    return a + b + c;
   }
   
   public static void main(String[] args) {
    System.out.println(sum(4,5));
    System.out.println(sum(4,5,4));
    
   }
}
