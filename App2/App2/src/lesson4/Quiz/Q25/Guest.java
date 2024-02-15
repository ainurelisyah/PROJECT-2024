package lesson4.Quiz.Q25;

class Message {
    public static void main(String[] args) {
        System.out.println("Welcome" + args[0] + "!");
    }
}
public class Guest {
    public static void main(String[] args) {
        Message.main(args);
    }
}
