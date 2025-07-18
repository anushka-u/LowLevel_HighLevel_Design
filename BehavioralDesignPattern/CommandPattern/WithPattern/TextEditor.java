package CommandPattern.WithPattern;

public class TextEditor {
    public void BoldText(){
        System.out.println("Text has been bolded");
    }

    public void ItallicText(){
        System.out.println("Text has been Itallic");
    }

    public void UnderlineText(){
        System.out.println("Text has been Underlined");
    }

    public  void changeColor(String color){
        System.out.println("Changed text color to "+ color);
    }
}
