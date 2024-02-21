package lesson11;

public class ThreadSynchronization {

    private static int sharedVariable = 0;

    public static void main(String[] args) {
        // Create two threads using lambda expression
        Thread thread1 = new Thread(() -> incrementSharedVariable());
        Thread thread2 = new Thread(() -> incrementSharedVariable());

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join(); //make the main thread wait for the both thread complete execute
        } catch (InterruptedException e) { //thrown when the thread is waiting
            e.printStackTrace(); 
        }

        System.out.println("Final shared variable value: " + sharedVariable);
    }

    //synchonized method that increment the sharedVariable in loop
    private static synchronized void incrementSharedVariable() {    //"synchonized" = ensure that only one thread can execute at a time
        for (int i = 0; i < 10000; i++) {
            sharedVariable++;
        }
    }
}