package lesson8.Ass8;

public interface PaymentGateway {
    
    void processPayment(double amount);
    
    boolean isPaymentSuccessful();
}
