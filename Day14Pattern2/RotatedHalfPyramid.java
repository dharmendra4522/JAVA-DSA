package Day14Pattern2;
import java.util.*;
public class RotatedHalfPyramid {
    public static void inverted(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row+col>=6){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many coloum you want: ");
        int a= sc.nextInt();
        inverted(a);
    }
}
