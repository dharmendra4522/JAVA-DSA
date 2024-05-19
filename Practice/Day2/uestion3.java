package Day2;
import java.util.*;


public class uestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pencil price: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter your pen price: ");
        float pen = sc.nextFloat();
        System.out.print("Enter your eraser price: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Your total Price is : "+total);

        //Add 18% gst 
        float newtotal = total + (0.18f * total);
        System.out.println("Your Price include 18% GST is : " + newtotal);

    }
    
}