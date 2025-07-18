package MementoDesignPattern.GoodDesign;

import java.util.Stack;

//Caretaker Class : Manage memento (Snapshots of the TextEditor State)
public class Caretaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor){
        history.push(editor.save());
    }

    public void undo(TextEditor editor)
    {
        if(!history.empty())
        {
            history.pop();
            editor.restore(history.pop());
        }
    }
}
