package Day35LiveRecursion;

public class Question1 {
    public static void returnIdx(int arr[],int idx, int key){
       // base case
        if(idx<arr.length){
            if(arr[idx]==key){
                System.out.println(idx+ " ");
            }
            //recursion
            returnIdx(arr,idx+1,key);
        }

  
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key =2;

        // //itirator
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]==key){
        //         System.out.println(i+" ");
        //     }
        // }
        // System.out.println(" ");

        returnIdx(arr,0,key);
    }
}
