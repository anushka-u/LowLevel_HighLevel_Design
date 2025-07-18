package CommandPattern.WithPattern;

import java.util.concurrent.Callable;

public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Button button = new Button();
        Command command = new BoldCommand(editor);
        button.setCommand(command);
        button.onClick();

        button.setCommand(new ItalicCommand(editor));
        button.onClick();

        button.setCommand(new ChangeColor(editor));
        button.onClick();
    }
}
