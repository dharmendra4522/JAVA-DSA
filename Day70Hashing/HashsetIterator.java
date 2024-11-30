package Day70Hashing;
import java.util.*;


public class HashsetIterator {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbia");
        cities.add("Noida");
        cities.add("Banguluru");

        //Using Iterators
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //advance loop
        for(String city: cities){
            System.out.println(city);
        }
    }
}
