package Day5ConditionalStatement;

public class LargestOf3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 6;

        if((a >= b) && (a >= c)){
            System.out.println("A is great");
        }else if(b >= c){
            System.out.println("B is great");
        }
        else{
            System.out.println("C is great");
        }
    }
    
}
