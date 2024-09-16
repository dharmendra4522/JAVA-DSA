package Day43LiveSolution;
import java.util.Scanner;
import java.util.ArrayList;


public class Ques3 {
    public static ArrayList<Integer> beautfulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int ans_size = ans.size();
            for(int i=0;i<ans_size;i++){
                if((ans.get(i)*2-1) <= n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            ans.addAll(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = beautfulArray(n);
        System.out.println(ans);
        
    }
}
