package singleResponsibilityPrinciple.goodDesign;

public class InvoiceGoodDesign {

    private double amount;

    public InvoiceGoodDesign(double amount){
        this.amount = amount;
    }

    public void GenerateInvoice(){
        System.out.println("Generating Invoice");
    }
}
