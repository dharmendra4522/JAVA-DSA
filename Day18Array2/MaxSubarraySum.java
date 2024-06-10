package Day18Array2;

public class MaxSubarraySum {
    public static void max_subarray_sum(int numbers[]){
        int currSum =0;
        int maxSUm =Integer.MIN_VALUE;

        
        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length;j++){
                int end=j;
                currSum =0;

                for(int k=start; k<=end; k++){
                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSUm< currSum){
                    maxSUm = currSum;
                }
               
            }
        }
        System.out.println("max sum = "  +maxSUm);
        
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        max_subarray_sum(number);
    }
}
