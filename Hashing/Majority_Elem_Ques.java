import java.util.*;

public class Majority_Elem_Ques {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 }; // Question

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // if (map.containsKey(arr[i])) {
            // map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            // map.put(arr[i], 1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Iterate
        // Set<Integer> count = map.keySet();
        // for (Integer k : count) {
        // if (map.get(k) > arr.length / 3) {
        // System.out.println(k);
        // }
        // }

        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}

// ---------------------------------------------

// import java.util.HashMap;
// import java.util.Map;

// public class Majority_Elem_Ques {
// public static void main(String[] args) {
// int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

// HashMap<Integer, Integer> map = new HashMap<>();

// for (int i = 0; i < arr.length; i++) {
// if (map.containsKey(arr[i])) {
// map.put(arr[i], map.get(arr[i]) + 1);
// } else {
// map.put(arr[i], 1);
// }
// }

// // Iterate
// for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
// if (entry.getValue() > arr.length / 3) {
// System.out.println("Number: " + entry.getKey() + ", Frequency: " +
// entry.getValue());
// }
// }
// }
// }
