package Day8;

public class RecverseString {
    public static void main(String[] args) {
        //reverse the sting

        String s = "abcde";
        int n = 5;
        String r = "";

        for(int i = n-1; i>=0; i--){
            r = r + s;
            System.out.println(r);
        }
    }
}
