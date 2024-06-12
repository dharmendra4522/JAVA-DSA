package Day21PractionQuestion;

public class Question2 {
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minPos = i;
            for(int j =i+1; j<n; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap

            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main (String[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
        printarr(arr);
    }
}
