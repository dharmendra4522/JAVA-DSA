package Day4Operator;

public class UnaryOperator {
    public static void main(String[] args) {
        // int a = 10;
        // /*
        //  * pre Increment--->(++a)
        //  *      1.value change
        //  *      2.value use
        //  */
        // int b = ++a;  
        // System.out.println(a);
        // System.out.println(b);

            // int a = 10;
            // /*
            //  * post Increment--->(a++)
            //  *      1.value use
            //  *      2.value change
            //  */
            // int b = a++;  
            // System.out.println(a);
            // System.out.println(b);

            // int a = 10;
            //      /*
            //       * pre Decrement--->(--a)
            //       *      1.value use
            //       *      2.value change
            //       */
            // int b = --a;  
            // System.out.println(a);
            // System.out.println(b);

            int a = 10;
                 /*
                  * post Decrement--->(a--)
                  *      1.value use
                  *      2.value change
                  */
            int b = a--;  
            System.out.println(a);
            System.out.println(b);


    }
}
