package Day24PracticeQuestion;

public class Question3 {
    public static void transposeMatrix(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };
        transposeMatrix(nums);
    }
}
