package Day1;
public class MaxOf3numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 1; 
        int c = 9;
        if (a>b) {
            if (a>c) {
                System.out.println("Greatest Number is a:" + a);
            }
            else{
                System.out.println("Greatest Number is c: "+ c);
            }
            
        }
        else{
            if (b>c) {
                System.out.println("Greatest Number is b:" + b);
            }   
            else{
                System.out.println("Greatest Number is c: "+ c);
            }   
        }
    }
    
}
