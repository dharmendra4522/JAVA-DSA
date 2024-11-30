package Day70Hashing;
import java.util.*;

public class Operation {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();
        //Insert -- O(1)
        hm.put("India", 120);
        hm.put("Chaina", 150);
        hm.put("USA", 50);
        System.out.println(hm);
        //Get -- O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Pak"));
        //containsKey --O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Pak"));

        //remove
        System.out.println(hm.remove("USA"));
        System.out.println(hm);
        System.out.println(hm.remove("Pak"));
        System.out.println(hm);
        //size
        System.out.println(hm.size());

        //IS Empty
        hm.clear();
        System.out.println(hm.isEmpty());
        
    }
}
