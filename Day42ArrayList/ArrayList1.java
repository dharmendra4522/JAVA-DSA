package Day42ArrayList;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Operations
        //1. Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9);

        System.out.println(list);

        //2. Get Operation
        int element = list.get(2);
        System.out.println(element);

        //3. Remove Element
        list.remove(2);
        System.out.println(list);

        //4.Set Element
        list.set(2, 10);
        System.out.println(list);

        //5. contains Element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Size count
        System.out.println(list.size());

        //prin the arraylist
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
}
