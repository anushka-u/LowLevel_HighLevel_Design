package MediatorPattern.WithoutMP;

public class User {
    public String name;

    public User(String name)
    {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sendMessage(String message, User Reciepient)
    {
        System.out.println(this.name + " sends message, " + message + " to " + Reciepient.getName());
    }

    public String getName(){
        return name;
    }
}
