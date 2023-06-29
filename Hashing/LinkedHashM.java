// Keys are inserted in order
// Order is maintained in in LinkedHashmap.
// Uses doubly LinkedList for storing data

import java.util.*;

public class LinkedHashM {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);
    }
}
