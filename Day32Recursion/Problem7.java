package Day32Recursion;

public class Problem7 {
    //find the first occurence of an element in an array
    public static int firstOccur(int arr[], int i, int key){
        if(i== arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccur(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println("Index Number is: "+firstOccur(arr,0, 5));
    }
}
