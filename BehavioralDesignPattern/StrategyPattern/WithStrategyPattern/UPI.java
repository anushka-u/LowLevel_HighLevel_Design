package StrategyPattern.WithStrategyPattern;

public class UPI implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing Payment via UPI");
    }
}
