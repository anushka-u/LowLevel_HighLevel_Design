package StrategyPattern.WithStrategyPattern;


public class PaymentMain {

    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        PaymentStrategy strategy = new CreditCard();
        service.setPaymentStrategy(strategy);
        service.pay();

        service.setPaymentStrategy(new DebitCard());
        service.pay();

        service.setPaymentStrategy(new UPI());
        service.pay();
    }
}
