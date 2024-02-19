package lesson8.AbstractClass.Ass9;

public class Main {
    public static void main(String[] args) {
        String emailMessage = "Hello, this is an email message!";
        String smsMessage = "Hi, this is an SMS message!";

        //Using EmailSender
        EmailSender emailSender = new EmailSender();
        emailSender.sendMessage(emailMessage);

        //USinh SMSSender
        SMSSender smsSender = new SMSSender();
        smsSender.sendMessage((smsMessage));
    }
}
