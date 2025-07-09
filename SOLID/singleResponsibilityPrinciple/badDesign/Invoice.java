package singleResponsibilityPrinciple.badDesign;


/*Below code is bad Design because here one single class has multiple responsibility such as
generating Invoice, saving it to database and sending out notifications,
now to make change in any of the method which aren't related to invoice class
you will need to change the class itself, The S in SOLID principle says that a class
should have only one responsibility so below class is violation of Single
Responsibility principle
*/

public class Invoice {

    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Generating invoice");
    }

    public void saveToDatabase(){
        System.out.println("Saving Record in database");
    }

    public void sendNotification(){
        System.out.println("Sending Notification");
    }
}
