import LinkedList.Node;

// 1. LL -> mid
// 2. (1) Left Half <- MS
//    (2) Right Half <- MS
//    mid.next = null
// 3. merge

public class MergeSortonLL {

    public Node findMid(Node head) { // Find middle of a node
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is middle
    }
    public static void main(String[] args) {
        
    }
}
