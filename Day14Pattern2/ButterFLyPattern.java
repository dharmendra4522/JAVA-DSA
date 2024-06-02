package Day14Pattern2;

public class ButterFLyPattern {
    public static void butter_fly(int n){
        //1st half
        for(int row=1; row<=n; row++){
            //stars - row
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            //apaces- 2*(n-i)
            for(int col=1; col<=2*(n-row); col++){
                System.out.print(" ");
            }

            //stars -i
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
    
        }
        
        //2nd half
        for(int row=n; row>=1; row--){
            //stars - row
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            //apaces- 2*(n-i)
            for(int col=1; col<=2*(n-row); col++){
                System.out.print(" ");
            }

            //stars -i
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();

        }
       

    }
    public static void main(String[] args) {
        butter_fly(10);
    }
}
