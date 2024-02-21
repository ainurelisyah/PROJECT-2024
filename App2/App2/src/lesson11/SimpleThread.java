package lesson11;

public class SimpleThread extends Thread {
    public static void main(String[] args) {
        //lamda function inside thread
        Thread thread = new Thread(() -> {

            System.out.println("Hello World");
        });

        thread.start();

    }
}
