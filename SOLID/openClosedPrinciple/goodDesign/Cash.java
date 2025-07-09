package openClosedPrinciple.goodDesign;

public class Cash implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via Cash");
    }
}
