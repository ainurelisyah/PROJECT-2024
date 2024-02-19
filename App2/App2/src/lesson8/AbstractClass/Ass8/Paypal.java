package lesson8.AbstractClass.Ass8;

public class Paypal implements PaymentGateway {

    private boolean paymentSuccessful; 

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of RM" + amount);
        paymentSuccessful = true;
    }

    @Override
    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }
    
}
