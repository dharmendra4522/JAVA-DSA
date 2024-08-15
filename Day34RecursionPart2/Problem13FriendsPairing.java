package Day34RecursionPart2;

public class Problem13FriendsPairing {
    public static int friendsPairing(int n){
        //base case
        if(n == 1 || n ==2){
            return n;
        }
        // //Choice
        // //Single
        // int fnm1 = friendsPairing(n-1);

        // //doubles Pair
        // int fnm2 = friendsPairing(n-2);

        // // total ways
        // int totalWays = fnm1 + (n-1)*fnm2;
        // return totalWays;

        return  friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
     public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPairing(n));
     }
}
