package Day14Pattern2;

class HollowTectangle {
    public static void hollow_rectangle(int totRows, int totCols){
        //outer Loop
        for(int i=1; i<=totRows;i++){
            //inner Loop
            for(int j=1; j<=totCols; j++ ){
                //cell - (i,j)
                if(i==1 || i == totRows || j==1 || j == totCols){
                    //bondary cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(5,5);
    }
    
}