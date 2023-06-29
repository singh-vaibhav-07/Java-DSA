// Keys are sorted in order (alphabet)
// put, get, remove -> O(log n)
// Uses Red-Black Trees (BST - Self balancing tree)

import java.util.*;

public class Tree_map {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println(tm);

    }
}
