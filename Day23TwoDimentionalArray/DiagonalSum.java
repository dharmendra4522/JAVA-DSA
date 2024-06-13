package Day23TwoDimentionalArray;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){  //O(n^2)
        int sum =0;
        // for(int i=0; i<matrix.length;i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         //Primary
        //         if(i==j){
        //             sum += matrix[i][j];  
        //         }
        //         //Secondary
        //         if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length;i++){  //O(n)
            //primary
            sum += matrix[i][i];
            //secondary
            if(i != matrix.length-i-1)
                sum += matrix[i][matrix.length-i-1];
        }
        
        return sum;   
     }
 public static void main(String[] args) {
    int matrix[][] = { {1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
         System.out.println(diagonalSum(matrix)); 
    
 }   
}
