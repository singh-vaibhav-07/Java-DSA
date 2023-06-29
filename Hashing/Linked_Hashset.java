import java.util.*;

public class Linked_Hashset {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Chennai");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        // Sorted in ascending order, so NULL values are not allowed.
        
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Chennai");
        System.out.println(ts);
    }
}
