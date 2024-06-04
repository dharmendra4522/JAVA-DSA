package Array;

public class printAllSubarrays {
    public static void main(String[] args) {
        int n=4;
        int arr[] = new int[n];    
        arr[0] =5;
        arr[1] =10;
        arr[2] =14;
        arr[3] =7;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j;k++){
                    System.err.print(arr[k]+ " ");
                }
                System.err.println();
            }
            System.err.println();
        }
    }
}
