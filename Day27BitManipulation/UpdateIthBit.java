package Day27BitManipulation;

public class UpdateIthBit {
    //1st Method Use previous Methods
    public static int clearIthBit(int n, int i){
        int bitMarks = ~(1<<i);
        return n & bitMarks;
    }
    public static int setIthBit(int n, int i){
        int bitMarks =(1<<i);
        return n | bitMarks;
     } 
     public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // } else{
        //     return setIthBit(n, i);
        // }
    
        //2nd method
        int BitMask = newBit<<i;
        return n | BitMask;
 }

     public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
        
     }
}
