package CommandPattern.WithoutPattern;

public class ItallicButton {
    private TextEditor textEditor;

    public ItallicButton(TextEditor editor)
    {
        this.textEditor =editor;
    }

    public void onClick(){
        textEditor.ItallicText();
    }
}
