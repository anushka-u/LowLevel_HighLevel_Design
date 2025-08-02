package AdapterPattern.WithADP;


public class SendGridAdapterClass implements NotificationService {

    private SendGrid sendGrid;

    public SendGridAdapterClass(SendGrid sendGrid){
        this.sendGrid =sendGrid;
    }
    @Override
    public void send(String to, String subject, String body) {
        //Adapter Method -> Convert parameter calls to SendGrid method
        sendGrid.sendEmails(to,subject,body);
    }
}
