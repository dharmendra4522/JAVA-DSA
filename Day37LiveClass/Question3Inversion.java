package Day37LiveClass;

public class Question3Inversion {
    public static int[] countInversions(int[] arr){
        int count = 0;

        for(int i=0; i<arr.lenght; i++){
            int ele = arr[i];
            for(int j=i+1; j<arr.lenght; j++){
                if(arr[j] < ele){
                    count++;

                }

            }

        }
    }
    public static void main(String[] args) {
        
    }
}
