package Day56GreedyLive;


public class Question1 {
    static int BlancedPartition(String str, int n){
        if(n == 0){
            return 0;
        }
        int r =0, l=0;
        int ans =0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'R'){
                r++;
            } else if(str.charAt(i) == 'L'){
                l++;
            }
            if(r == l){
                ans++;
                r =0;
                l=0;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL"; 
        int n = str.length();
        System.out.println("maximum balanced string pratitions is: " + BlancedPartition(str, n));
    }
}
