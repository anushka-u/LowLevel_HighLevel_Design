package cursor.management;

import java.util.ArrayList;
import java.util.Stack;

public class Caretaker {

    Stack<Memento> undoStack = new Stack<>();
    Stack<Memento> redoStack = new Stack<>();

    TextEditor editor;
    public  Caretaker(TextEditor editor) {
        this.editor = editor;
    }

    public void insert(String text){
        Memento previousMemento =  editor.createMemento();
        undoStack.push(previousMemento);

        editor.insert(text);
        while (!redoStack.isEmpty())
        {
            redoStack.pop();
        }
    }

    public void moveCursorToRequiredPosition(int position){
        editor.moveCursorToRequiredPosition(position);
    }

    public void insertIntoUndo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(editor.createMemento());

            Memento memento = undoStack.pop();
            editor.restoreMemento(memento);
        }
    }

    public void redoStack(){
        if(!redoStack.isEmpty()) {
            redoStack.push(editor.createMemento());


            Memento memento = redoStack.pop();
            editor.restoreMemento(memento);
        }
    }

    public String getContent(){
        return editor.getText();
    }
}
