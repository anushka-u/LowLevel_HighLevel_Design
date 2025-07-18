package CommandPattern.WithPattern;

import CommandPattern.WithPattern.TextEditor;

public class ChangeColor implements Command{

    private TextEditor editor;

    public ChangeColor(TextEditor editor)
    {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.changeColor("Pink");
    }
}
