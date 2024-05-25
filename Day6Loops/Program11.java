import java.util.*;
public class Program11 {
    
    public static void main(String[] args) {
            //keep entering number till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        

        do{
            System.out.print("Enter Your Number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);

    }
}
