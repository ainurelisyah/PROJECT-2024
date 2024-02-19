package lesson8.GenericClasses.GenericQueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {
    private Queue<T> queue;

    public GenericQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        // Test GenericQueue with Integer
        GenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.enqueue(5);
        intQueue.enqueue(10);
        System.out.println("Dequeued item from Integer queue: " + intQueue.dequeue());
        System.out.println("Is Integer queue empty? " + intQueue.isEmpty());

        // Test GenericQueue with String
        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");
        System.out.println("Dequeued item from String queue: " + stringQueue.dequeue());
        System.out.println("Is String queue empty? " + stringQueue.isEmpty());

        // Test GenericQueue with Boolean
        GenericQueue<Boolean> booleanQueue = new GenericQueue<>();
        booleanQueue.enqueue(true);
        booleanQueue.enqueue(false);
        System.out.println("Dequeued item from Boolean queue: " + booleanQueue.dequeue());
        System.out.println("Is Boolean queue empty? " + booleanQueue.isEmpty());
    }
}
