package openClosedPrinciple.goodDesign;

public class UPI implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying via UPI");
    }
}
