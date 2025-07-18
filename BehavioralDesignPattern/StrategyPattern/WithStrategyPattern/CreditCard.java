package StrategyPattern.WithStrategyPattern;

public class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing Payment via Credit Card");
    }
}
