package Day43LiveSolution;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;


public class Ques1 {
    public static int mostFrequent(ArrayList<Integer> nums, int key){
        int[] count = new int[1001];
    
        for (int i = 0; i < nums.size()-1; i++) {

            if (nums.get(i) == key) {
                count[nums.get(i+1)]++;

            }

        }
        //find the index with the greatest entry
        int maxValue=0;
        int target =0;
        for(int i=0;i<count.length;i++){
            //maxIndex= count[i]>count[maxIndex] ? i : maxIndex;
            if(count[i] > maxValue){
                target =i;
                maxValue = count[i];
            }

        }
        return target;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of list: ");
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());

        }
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int result = mostFrequent(nums, key);
        System.out.println("The Most frequent number after "+key+ " is: "+ result);

    }

}
