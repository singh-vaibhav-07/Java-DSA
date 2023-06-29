import java.util.LinkedList;

public class JCFinLL {
    public static void main(String[] args) {
        // Create
        LinkedList<Integer> ll = new LinkedList<>();

        // Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);

        System.out.println(ll);

        // Remove
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

        ll.add(1, 7);
        System.out.println(ll);
    }
} 
