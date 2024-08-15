package Day32Recursion;

public class Problem8 {
     //find the first occurence of an element in an array
     public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;

     }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println("Index Number is: "+lastOccurence(arr,5, 0));
    }
}
