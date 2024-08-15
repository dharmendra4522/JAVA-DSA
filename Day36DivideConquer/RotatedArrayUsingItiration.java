package Day36DivideConquer;

public class RotatedArrayUsingItiration {
    public static int search(int arr[], int tar){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 }; // output=4
        int target = 0;
        int idx = search(arr, target);
        System.out.println("Index of target is: " + idx);
    }
}
