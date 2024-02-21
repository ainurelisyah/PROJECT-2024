package lesson11;

import java.util.LinkedList;

public class ProducerConsume {

    private static final int BUFFER_SIZE = 5;
    private static LinkedList<Integer> buffer = new LinkedList<>();

    public static void main(String[] args) {

        // Create a shared buffer
        LinkedList<Integer> buffer = new LinkedList<>();

        // Create producer & consumer threads using lambda expressions
        Thread producerThread = new Thread(() -> produce());
        Thread consumerThread = new Thread(() -> consume());

        // Start the threads
        producerThread.start();
        consumerThread.start();

    }

    private static void produce() {
        for (int i = 1; 1 <= 10; i++) {
            synchronized (buffer) {
                while (buffer.size() == BUFFER_SIZE) {
                    try {
                        System.out.println("Buffer is full. Producer is waiting...");
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Produce item and add to buffer
                System.out.println("Producing item: " + i);
                buffer.add(i);

                // Notify consumer that an item is produced
                buffer.notify();
            }

            // Sleep for a short time to simulate work
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consume() {
        for (int i = 1; i <= 10; i++) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        System.out.println("Buffer is empty. COnsumer is waiting...");
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Consume item from buffer
                int item = buffer.removeFirst();
                System.out.println("Consuming item: " + item);

                // Notify producer that an item is consumed
                buffer.notify();
            }

            // SLeep for a short time to simulate work
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
