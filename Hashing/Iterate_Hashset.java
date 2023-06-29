// Iterator is an interface, which will return an iterator if we make a call.
// (a) using iterators -> using it.hasNext()
// (b) using enhanced for loop

import java.util.*;

public class Iterate_Hashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Chennai");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
