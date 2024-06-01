package Day11Live;

import java.util.Scanner;

public class XPattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Star : ");
        int n=sc.nextInt();    
        // int n=5;
        for(int row =1; row<=n; row++){
            for(int col=1; col <=n; col++){
                if(col-row==0 || col+row == n+1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
