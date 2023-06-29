import org.w3c.dom.Node;

public class PrintLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // add at starting
        Node newNode = new Node(data);
        size++;

        if (head == null) { // when LL is empty
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data) { // add at last
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void addMiddle(int index, int data) {// add in middle

        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // when i = index - 1, at that point : temp -> prev;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail ka data.
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Iterative search
    public int iterativeSearch(int key) { // Time - O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // found case
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1; // not found case
    }

    // Recursive search
    public int helper(Node head, int key) { // this is actual rec search
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    public int recursiveSearch(int key) { // Time - O(n)
        return helper(head, key);

    }

    // For reversing a linked list
    public void reverseList() { // Iterative approach - O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void printList() { // print a linked list - Time : O(n)

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Find and remove Nth node from the end. (Iterative Approach)
    // Logic : Size-n-+1
    public void deleteNthfromEnd(int n) {
        // calculate size :
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == size) {
            head = head.next; // remove first
            return;
        }

        // for (sz-n)
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) { // Find middle of a node
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is middle
    }

    // -----------------------------
    // Check if Linked List is PALINDROME
    // 1. Find midNode
    // 2. Reverse 2nd half
    // 3. check LeftHalf = RightHalf

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node current = midNode;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node right = prev; // right half ka head
        Node left = head;

        // step 3 - check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() { // Flyod's Cycle Finding Algorithm.
        Node slow = head;
        Node fast = head;

        while (fast != null || fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) { // cycle exists
                return true;
            }
        }
        return false; // cycle does not exist
    }

    public static void removeLoop() {
        // detect loop
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast.next != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;

    }

    public Node getMid(Node head) { // Find middle of a node
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is middle node
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    // Merge Sort in a Linked List
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // left and right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        PrintLinkedList ll = new PrintLinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addMiddle(2, 3);

        // ll.removeFirst();
        // ll.printList();
        // ll.removeLast();
        // ll.printList();
        // System.out.println(size);

        // System.out.println(ll.iterativeSearch(7));
        // System.out.println(ll.iterativeSearch(14));

        // System.out.println(ll.recursiveSearch(7));
        // System.out.println(ll.recursiveSearch(14));

        // ll.reverseList();

        // ll.deleteNthfromEnd(3);
        // ll.printList();

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.printList();
        // System.out.println(ll.checkPalindrome());

        // System.out.println(isCycle());

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // // ll.addFirst(5);
        // ll.printList();

        // ll.head = ll.mergeSort(ll.head);
        // ll.printList();

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeLoop();
        // System.out.println(isCycle());
    }
}
