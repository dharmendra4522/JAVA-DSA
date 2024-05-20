package Day4Operator;

public class LogicalOperator {
    public static void main(String[] args) {
        //logical AND(&&) --> when both statement are true then return true otherwise false
        System.out.println("Logical AND(&&) Operator");
        System.out.println( (3>2) && (5>0) );
        System.out.println( (3<2) && (5>0) );
        System.out.println( (3>2) && (5<0) );
        System.out.println( (3<2) && (5<0) );
        //logical OR(||)--> when both statement are flase then return false otherwise true
        System.out.println("Logical OR(||) Operator");
        System.out.println( (3<2) || (5<0) );
        System.out.println( (3>2) || (5<0) );
        System.out.println( (3<2) || (5>0) );
        System.out.println( (3>2) || (5<0) );
        //logical NOT(!)--> It covaert the the statement [treu-->False and False-->True]
        System.out.println("Logical NOT(!) Operator");
        System.out.println( !(3>2));
        System.out.println( !(5<0) );
    }
    
}
