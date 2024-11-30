package Day70Hashing;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("Chaina", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 5);

        System.out.println(tm);

        // compare with hashmap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Chaina", 150);
        hm.put("US", 50);

        System.out.println(hm);
    }

}
