package lesson8.AbstractClass.Ass8;

public class Main {
    public static void main(String[] args) {
        double amount = 50.0;

        PaymentGateway paypalGateway = new Paypal();
            if (paypalGateway.isPaymentSuccessful()){
                System.out.println("Payment through Paypal was succesfull");
            } else {
                System.out.println("Payment through PayPal failed");
            }
            System.out.println(); // separator

            PaymentGateway stripeGateway = new Stripe();
            stripeGateway.processPayment(amount);
            if (stripeGateway.isPaymentSuccessful()) {
                System.out.println("Payment through Stripe was succesfull");
            } else {
                System.out.println("Payment through Stripe failed");
            }
    }
}
