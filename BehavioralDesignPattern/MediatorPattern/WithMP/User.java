package MediatorPattern.WithMP;

public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator)
    {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void revcieveMessage(String msg, User sender){
        System.out.println(this.name + " recieve message " + msg + " from "+ sender.getName() );
    }

    public void sendMessage(String msg){
        System.out.println(this.name + " sending -> message " + msg);
        chatMediator.sendMessage(msg,this);
    }
}
