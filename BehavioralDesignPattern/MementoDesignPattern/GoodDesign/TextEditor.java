package MementoDesignPattern.GoodDesign;

public class TextEditor {
    private String content;

    public void write(String content){
        this.content =content;
    }

    public String getContent(){
        return content;
    }

    //Save the current state of editor
    public EditorMemento save()
    {
        return new EditorMemento(content);
    }

    //Restore (Memento -> update the state of current content)
    public void restore(EditorMemento editorMemento)
    {
        content = editorMemento.getContent();
    }
}
