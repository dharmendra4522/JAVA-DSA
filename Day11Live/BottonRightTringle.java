package Day11Live;

import java.util.Scanner;

public class BottonRightTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Star : ");
        int n=sc.nextInt();
        for(int row =1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row+col >= n+1){
                    System.out.print("*");
                } 
                else{
                    System.out.print("_");
                }
            } 
            System.out.println();  
        }
    }
}
