package Day27BitManipulation;

public class Ques3CountSetBits {
    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n & 1) != 0){  //check our LSB
                count++;
            }
            n = n >> 1; //Right Shift
        }
        return count;
    }
    public static void main(String[] args){
        int n = 16; //1001
        System.out.println("Number of set bits in "+n+" is "+countSetBits(n));
    }
}
