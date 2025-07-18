package CommandPattern.WithoutPattern;

public class BoldButton {

    private TextEditor editor;

    public BoldButton(TextEditor editor)
    {
        this.editor = editor;
    }

    public void onClick(){
        editor.BoldText();
    }
}
