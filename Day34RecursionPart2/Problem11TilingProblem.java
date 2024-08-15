package Day34RecursionPart2;

public class Problem11TilingProblem {
    public static int tilingProblem(int n){ //2 * n (floor sizr)

        //base case
        if(n ==0 || n ==1){
            return 1;
        }
        //kaam
        //Vartical choice
        int fnm1 = tilingProblem(n-1);

        //Horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}
