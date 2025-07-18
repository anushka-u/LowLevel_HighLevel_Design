package StrategyPattern.WithStrategyPattern;

public class DebitCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing Payment via DebitCard");
    }
}
