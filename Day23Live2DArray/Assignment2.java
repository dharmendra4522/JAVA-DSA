package Day23Live2DArray;

public class Assignment2 {
    public static void main(String[] args) {
        int[][] nums = {{1,4,9}, {11,4,3},{2,2,3}};

         int n = nums.length;
         int m = nums[0].length;

         int sum =0;
         for(int j=0; j<m; j++){
             sum += nums[1][j];
         }
         System.out.println(sum);
    }
}