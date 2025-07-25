package MediatorPattern.WithMP;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements  ChatMediator{

    private List<User> users;

    public ChatRoom(){
        this.users = new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, User sender) {
        for(User u : users){
            if(sender == u){
                continue;
            }
            u.revcieveMessage(msg,sender);
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
