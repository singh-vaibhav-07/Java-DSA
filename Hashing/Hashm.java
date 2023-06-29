import java.util.*;

public class Hashm {
    public static void main(String[] args) {

        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        // int population = hm.get("France"); // --> Null value.
        System.out.println(population);

        // ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));

        // Remove - O(1)
        hm.remove("China");
        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // Is Empty
        System.out.println(hm.isEmpty());

        // Clear
        hm.clear();
        System.out.println(hm);
    }
}