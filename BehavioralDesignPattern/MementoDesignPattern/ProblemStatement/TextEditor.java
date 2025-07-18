package MementoDesignPattern.ProblemStatement;

public class TextEditor {
    private String content;

    public void write(String content){
        this.content =content;
    }

    public String getContent(){
        return content;
    }

}
