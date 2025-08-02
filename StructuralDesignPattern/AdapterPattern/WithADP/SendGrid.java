package AdapterPattern.WithADP;

public class SendGrid {

    public void sendEmails(String recepient, String title, String content){
        System.out.println("Recepient "  +  recepient);
        System.out.println("Title "+ title);
        System.out.println("Content : "+ content);
    }
}
