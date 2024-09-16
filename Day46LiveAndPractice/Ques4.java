import java.util.*;
 
//BeautifullArray
public class Ques4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int remain = n-1;
        ans.add(1);

        for(int i=1; i<=remain; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int element : ans){
                if(element*2<=n){
                    temp.add(element*2);
                }
            }
            for(int element : ans){
                if(element*2-1<=n){
                    temp.add(element*2-1);
                }
            }
            ans = temp;
        }
        System.out.println(ans);

    }
}
