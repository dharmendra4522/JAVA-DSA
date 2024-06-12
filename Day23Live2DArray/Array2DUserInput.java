package Day23Live2DArray;

import java.util.Scanner;

public class Array2DUserInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create 2D Array
        int [][] arr = new int[4][3];
        int n = arr.length;     //numbers of row
        int m = arr[0].length;  //numbers of column
        
        //inter n*m values

        System.out.println("Printing the 2D Array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Input " +i+", "+j+" cell:");
                arr[i][j] = sc.nextInt();
            }
        }


        //Itirate(access) 2D array
        for(int i=0; i<n; i++){
            System.out.println("Print " + i + " Row");
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+ " ");
                // System.out.println(arr[i][j]);
            }
            System.out.println("");
        }
    }
}