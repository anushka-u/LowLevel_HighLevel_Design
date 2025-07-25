package MediatorPattern.WithoutMP;

public class ClientMain {

    public static void main(String[] args) {
        User user = new User("Aditi");
        User user1 = new User("Soumaya");
        User user2= new User("Supriya");

        user1.sendMessage("Hey, How are you?" , user);
    }
}
