package Day17Live.Array;

public class binarySearch {
    public static void main(String[] args) {
        int n=6;
        int arr[] ={10,20,30,40,50,60};
        int target = 50;

        int low=0;
        int high = n-1;
       int index=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            } else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
            System.out.print(index);
        }
    }
}
