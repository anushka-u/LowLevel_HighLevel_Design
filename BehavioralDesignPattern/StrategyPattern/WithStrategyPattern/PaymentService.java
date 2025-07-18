package StrategyPattern.WithStrategyPattern;

public class PaymentService {

    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy strategy)
    {
        this.paymentStrategy = strategy;
    }

    public void pay(){
        paymentStrategy.processPayment();
    }
}
