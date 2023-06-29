import java.util.*;

public class StackReverse {

    public static void PushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushBottom(s, data);
        s.push(top);
    }

    public static void revStack(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        revStack(s);
        PushBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s); // 3, 2, 1
        revStack(s);
        printStack(s); // 1, 2, 3
    }
}
