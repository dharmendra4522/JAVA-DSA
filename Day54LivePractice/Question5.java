package Day54LivePractice;

public class Question5 {
    static void printSlidingWindoaMaxBruteForce(int arr[], int N, int K){
        for(int i = 0; i <= N - K; i++){
            int max = arr[i];
            for(int j = i; j < i + K; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
                System.out.print(max +" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int N = arr.length;
        int K = 3;
        printSlidingWindoaMaxBruteForce(arr, N, K);
        
    }
}
