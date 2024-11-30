package Day70Hashing;
import java.util.*;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Chaina", 150);
        lhm.put("US", 50);

        System.out.println(lhm);

        //compare with hashmap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Chaina", 150);
        hm.put("US", 50);
        
        System.out.println(hm);
    }
}
