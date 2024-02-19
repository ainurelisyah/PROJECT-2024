package lesson8.AbstractClass.Ass8;

interface PaymentGateway {
    
    void processPayment(double amount);
    
    boolean isPaymentSuccessful();
}
