import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // adding elements
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
        System.out.println("Size: " + set.size());

        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());

    }
}
