package Day17Live.Array;
public class ArraySwap{

    public static void main(String[] args){
        int n =5; 
        int arr[] = new int[n];
        arr[0]=7;
        arr[1]=6;
        arr[2]=10;
        arr[3]=15;
        arr[4]=2;
        System.out.println("Original Array is = " + arr);

        int i=0;
        int j =n-1;
//left and right pointer can not cross each other
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("After Reverse the array: ");
        for(i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}