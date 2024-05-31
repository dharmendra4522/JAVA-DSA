package Day12Method;

public class Overloading2 {
     //func to calc integer sum of 2 numbers
   public static int sum(int a, int b){
    return a+b;
   }
   //func to calc float sum of 2 numbers
   //overloading using Parameter
   public static float sum(float a, float b){
    return a+b;
   }
   
   public static void main(String[] args) {
    System.out.println(sum(4,5));
    System.out.println(sum(4.5f,6.2f));
    
   }
}
