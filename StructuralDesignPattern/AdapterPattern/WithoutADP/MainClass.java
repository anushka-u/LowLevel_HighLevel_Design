package AdapterPattern.WithoutADP;

public class MainClass {

    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        notificationService.send("codingminutes.com", "Regarding latest payment","Hi, we have recieved your mail regarding your latest faile" +
                "transaction query, The payment which has been deducted from your account will be refunded back within 4 to 5 business days" +
                "For any more query please contact our supervisor on number below +91-8765342197");
        /**
         * It won't work because SendGrid service isn't extending or implementing the NotificationService
         * We will solve this using adapter pattern
         */
        //NotificationService sendGridService = new SendGrid();
    }
}
