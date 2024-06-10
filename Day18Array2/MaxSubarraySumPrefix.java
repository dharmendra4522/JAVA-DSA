package Day18Array2;

public class MaxSubarraySumPrefix {
    public static void max_subarray_sum_prefix(int numbers[]){
        int currSum =0;
        int maxSUm =Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        //calculate prefix array

        for(int i =1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        
        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length;j++){
                int end=j;
                currSum =0;

                currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSUm< currSum){
                    maxSUm = currSum;
                }
               
            }
        }
        System.out.println("max sum = "  + maxSUm);
        
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        max_subarray_sum_prefix(number);
        
    }
}
