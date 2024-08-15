package Day37LiveClass;

public class MergeSort {
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        
        int[] res = new int[n+m];

        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                res[k] = arr2[i];
                i++;
            }
            else{
                res[k] = arr2[j];
                j++;

            }
            k++;
        }
            while(i<n){
                res[k] = arr1[i];
                i++;
                k++;
            }
            while(j<m){
                res[k] = arr2[j];
                j++;
                k++;
            }

            return res;
        
    }
    public static int[] mergeSort(int[] arr, int si, int ei){
        //base case
        if(si == ei){
            int[] ba = new int[1];
            ba[0] = arr[si];
            return ba;

        }

        int mid = (si+ei) /2;

        int[] left = mergeSort(arr, si, mid);
        int[] right = mergeSort(arr, mid+1, ei);
        int[] res = mergeTwoSortedArray(left, right);
    }
    public static void main(String[] args) {
        int arr[] ={4,1,7,2,9,5};
        int[] res = mergeSort(res);
       

    }
}
