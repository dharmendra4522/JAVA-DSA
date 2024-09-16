package Day42ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before sort"+list);
        Collections.sort(list); //ascending
        System.out.println("After sort "+list);
        //descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After sort "+list);

    }
}
