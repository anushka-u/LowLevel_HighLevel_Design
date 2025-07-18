package CommandPattern.WithPattern;

import CommandPattern.WithoutPattern.BoldButton;

public class BoldCommand implements Command{

    private TextEditor editor;

    public BoldCommand(TextEditor editor)
    {
        this.editor=editor;
    }
    @Override
    public void execute() {
        editor.BoldText();
    }
}
