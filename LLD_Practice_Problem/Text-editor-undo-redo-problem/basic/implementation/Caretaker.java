package basic.implementation;

import java.util.Stack;

/***
 * Caretaker
 *
 * Manages the history.
 * - Decides when to save a snapshot
 * - Maintains undo/redo stacks
 * - Decides which snapshot to restore
 */
public class Caretaker {

    private Stack<Memento> undoStack;
    private Stack<Memento> redoStack;

    private TextEditor editor;

    public Caretaker(TextEditor editor){
        this.editor = editor;
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void insert(String input) {
        // Save previous state, insert text, clear redo history
        Memento previousState = editor.createMemento();
        undoStack.push(previousState);

        editor.insert(input);
        while(!redoStack.empty()){
            redoStack.pop();
        }
    }

    public void undo() {
        //Current state ko redo mei save karo
        if(!undoStack.empty()) {
            redoStack.push(editor.createMemento());

            Memento previousState = undoStack.pop();
            editor.restore(previousState);
        }

    }

    public void redo() {
        if(!redoStack.empty()) {
            undoStack.push(editor.createMemento());

            Memento newstate = redoStack.pop();
            editor.restore(newstate);
        }
    }

    public String getText(){
        return editor.getText();
    }
}
