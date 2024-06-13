package Day24PracticeQuestion;

public class Question2 {
    public static void sumOfTheNumber(int arr[][]){
        int sum =0; 
        int n= arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i == 1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of the second row is: "+sum);
    }
    public static void main(String[] args) {
        int nums[][] =  {{1,4,9},
                        {11,4,3},
                        {2,2,3} };
         sumOfTheNumber(nums);              
    }
}
