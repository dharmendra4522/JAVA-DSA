package Day14Pattern2;

public class InvertedHalfPyramid {
    public static void inverted_hal_pyramid_with_number(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] agrs){
        inverted_hal_pyramid_with_number(5);
    }
}
