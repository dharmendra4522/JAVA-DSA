package Day14Pattern2;

public class RotatedHalfPyramid2 {
    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int row=1; row<=n; row++){
            //spaces
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            // stars
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(5);
    }
}
