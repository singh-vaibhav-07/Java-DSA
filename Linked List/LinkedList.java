public class LinkedList {
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

    public void addFirst(int data) {
        // 1. create new node
        Node newNode = new Node(data);

        if (head == null) { // if head and tail same ho
            head = tail = newNode;
        }
        // 2. new node ke next ko head se point karwana hai
        newNode.next = head;

        // 3. head ki value new node ko mil jaye
        head = newNode;
    }

    public void addLast(int data) {
        // 1. Creating a new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = null;
        }

        // 2. tail ke baad new node ko lagana and new node ko null ke taraf point
        // karwana
        tail.next = newNode;

        // 3. last node ko ham tail bana denge
        tail = newNode;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);
    }
}