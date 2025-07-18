package CommandPattern.WithoutPattern;

public class TextEditorMain {

    //Problem with code is, TextEditor is tightly coupled with the Buttons.
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        BoldButton button = new BoldButton(editor);
        button.onClick();

        ItallicButton itallicButton = new ItallicButton(editor);
        itallicButton.onClick();
    }
}
