package Day24Live2DArray;
//How many 7's present 
// input int[][] array = {{4,7,8},{8,8,7}}
// output - 2
public class Assignment1 {
    public static void main(String[] args) {
        int[][] array = {{4,7,8},{8,8,7}};

        int n = array.length;
        int m = array[0].length;
        int count =0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(array[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Count of 7 in 2D array is: "+count);
    }
}
