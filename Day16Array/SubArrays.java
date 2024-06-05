package Day16Array;
public class SubArrays {
    //Print Subarrays ---> it is a continuous part of array
    public static void printSubarrays(int numbers[]){
        int ts =0;
       for(int i=0; i<numbers.length; i++){
        int start =  i;
        for(int j=i+1; j<numbers.length; j++){
            int end = j;
            for(int k=start; k<= end; k++){
                System.out.print(numbers[k]+ " "); //subarray
                
            }
            ts++;
            System.out.println();
        }
        System.out.println();
       }
       System.out.println("total dubarrays = "+ts++);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
    
}
