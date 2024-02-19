package lesson8.AbstractClass.Ass9;

public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
    
}
