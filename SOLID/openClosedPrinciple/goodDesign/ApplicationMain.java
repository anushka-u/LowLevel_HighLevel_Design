package openClosedPrinciple.goodDesign;

public class ApplicationMain {

    public static void main(String[] args) {
        PaymentMethod paymentMethod = new CreditClass();
        paymentMethod.pay(9000.98);

        PaymentMethod paymentMethod1 = new UPI();
        paymentMethod1.pay(8675.90);
    }
}
