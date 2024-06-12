package Day23Live2DArray;

public class Array2D {
    public static void main(String[] args) {
        //create 2D Array
        // int [][] arr = new int[4][3];
        //astore element in array
        int [] [] arr = {
            {1,  2,  3},
            {4,  5,  6},
            {7,  8,  9},
            {10, 11, 12},
        };
        int n = arr.length;     //numbers of row
        int m = arr[0].length;  //numbers of column

        //Itirate 2D array
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
