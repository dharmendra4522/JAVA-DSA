package Day21LiveSorting;

public class CountSort {
    
    public static void main(String[] args) {
        int n=6;
        int arr[] = new int[n];
        arr[0] = 6;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 6;
        arr[4] = 2;
        arr[5] = 4;
        int mx=0;

        //finding the maximum element
        for(int i=0; i<n; i++){
            if(arr[i] > mx){
                mx=arr[i];
            }
        }

        //Initialization the count array
        int count[] = new int[mx+1];
        for(int i=0; i<n; i++){
            int element = arr[i];
            count[element]++;
        }

        //sorting in descensing order
        int k =0;
        for(int i=mx; i>=0; i--){  //deceanding order
            int freq= count[i];
            for(int j=1; j<=freq; j++){
                arr[k] = i;
                k++;
            }
        }

        //Printing the sorted array
        System.out.print("Sorted Array in Decreasing Order: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
