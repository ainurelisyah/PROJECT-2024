package lesson8.GenericLinkedList;

public class GenericLinkedList<T> {
    private Node<T> head;

    // Node class for the linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public GenericLinkedList() {
        this.head = null;
    }

    // Add an item to the end of the linked list
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Remove the first occurrence of the specified item from the linked list
    public void remove(T item) {
        if (head == null) {
            return;
        }

        if (head.data.equals(item)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(item)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        // Test GenericLinkedList with Integer
        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        intList.add(5);
        intList.add(10);
        intList.add(15);

        System.out.println("Is Integer list empty? " + intList.isEmpty());

        intList.remove(10);
        System.out.println("Is Integer list empty after removing 10? " + intList.isEmpty());

        // Test GenericLinkedList with String
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");

        System.out.println("Is String list empty? " + stringList.isEmpty());

        stringList.remove("Hello");
        System.out.println("Is String list empty after removing 'Hello'? " + stringList.isEmpty());

        // Test GenericLinkedList with Character
        GenericLinkedList<Character> charList = new GenericLinkedList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');

        System.out.println("Is Character list empty? " + charList.isEmpty());

        charList.remove('B');
        System.out.println("Is Character list empty after removing 'B'? " + charList.isEmpty());
    }
}

