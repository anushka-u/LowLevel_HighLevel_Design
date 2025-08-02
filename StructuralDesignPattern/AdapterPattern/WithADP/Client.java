package AdapterPattern.WithADP;


public class Client {
    public static void main(String[] args) {
       NotificationService emailNotification = new EmailNotificationService();
        emailNotification.send("codingminutes.com", "Regarding latest payment","Hi, we have recieved your mail regarding your latest faile" +
                "transaction query, The payment which has been deducted from your account will be refunded back within 4 to 5 business days" +
                "For any more query please contact our supervisor on number below +91-8765342197");


        System.out.println("USING SENDGRID ADAPTER CLASS");
        NotificationService sendGrid  = new SendGridAdapterClass(new SendGrid());
        sendGrid.send("codingminutes.com", "Regarding latest payment","Hi, we have recieved your mail regarding your latest faile" +
                "transaction query, The payment which has been deducted from your account will be refunded back within 4 to 5 business days" +
                "For any more query please contact our supervisor on number below +91-8765342197");
    }
}
