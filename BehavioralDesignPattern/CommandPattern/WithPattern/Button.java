package CommandPattern.WithPattern;

public class Button {

    private Command command;

    public void setCommand(Command command)
    {
        this.command =command;
    }

    public void onClick(){
        command.execute();
    }
}
