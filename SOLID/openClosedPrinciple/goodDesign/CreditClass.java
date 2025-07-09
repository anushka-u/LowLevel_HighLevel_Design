package openClosedPrinciple.goodDesign;

public class CreditClass implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via Credit Card");
    }
}
