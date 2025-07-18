package StrategyPattern.WithoutStrategyPattern;

public class PaymentMain {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("UPI");

        paymentService.processPayment("DebitCard");
    }
}
