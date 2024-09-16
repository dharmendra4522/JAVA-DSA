package Day42ArrayList;

import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);  

        //TC --> O(n) linear time
        int max = Integer.MIN_VALUE; //minus infinite
        for(int i=0; i<list.size(); i++){
            // if(max<list.get(i)){
            //     max = list.get(i);

            // }
            //In one line 
            max = Math.max(max, list.get(i));

        }
        System.out.println("max element = "+max);



    }
}
