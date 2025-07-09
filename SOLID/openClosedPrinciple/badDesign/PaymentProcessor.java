package openClosedPrinciple.badDesign;

import openClosedPrinciple.goodDesign.PaymentMethod;

/*
The below class is violation of Open-closed Principle, OCP states that a class should be open for extension
but closed for modification, now if we want to add one more payment method in the below class
we will have to modify the existing class which is against OCP.
 */
public class PaymentProcessor {

    private double amount;

    public PaymentProcessor(double amount){
        this.amount = amount;
    }
    public void paymentProcess(String paymentMethod, double amount)
    {
        if(paymentMethod.equals("CreditCard")){
            System.out.println("Paying Via CreditCard");
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Paying via Debit Card");
        } else if (paymentMethod.equals("Cash")) {
            System.out.println("Paying via Cash");
        }
    }

}
