package Day70Hashing;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        // set.remove(2);
        // set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        if(set.contains(3)){
            System.out.println("Set contains 3");
        }
    }
}
