package Day37LiveClass;

public class Main {
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] res = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr2[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;

            }
            k++;
        }
        while (i < n) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        int ans[] = mergeTwoSortedArray(arr1, arr2);
        System.out.println(ans);

    }
}
