package Day70Hashing;

import java.util.*;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbia");
        cities.add("Noida");
        cities.add("Banguluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbia");
        lhs.add("Noida");
        lhs.add("Banguluru");

        System.out.println(lhs);
        // lhs.remove("Delhi");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbia");
        ts.add("Noida");
        ts.add("Banguluru");
        System.out.println(ts);
    }
}
