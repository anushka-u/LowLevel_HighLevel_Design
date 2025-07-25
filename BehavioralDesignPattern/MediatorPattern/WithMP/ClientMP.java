package MediatorPattern.WithMP;

public class ClientMP {

    public static void main(String[] args) {

        ChatMediator chatMediator = new ChatRoom();

        User rakul = new User("Rakul",chatMediator);
        User aarohi = new User("Aarohi",chatMediator);
        User surbhi = new User("Surbhi",chatMediator);
        chatMediator.addUser(rakul);
        chatMediator.addUser(aarohi);
        chatMediator.addUser(surbhi);

        chatMediator.sendMessage("Hii, Everyone " , rakul);
        chatMediator.sendMessage("Hey All ", surbhi);

        rakul.sendMessage("How are you?");

    }
}
