import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGrt[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // 1. while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2. if else
            if (s.isEmpty()) {
                nxtGrt[i] = -1;
            } else {
                nxtGrt[i] = arr[s.peek()];
            }

            // 3. push in s
            s.push(i);
        }

        for (int i = 0; i < nxtGrt.length; i++) {
            System.out.print(nxtGrt[i] + " ");
        }
        System.out.println();
    }
}
