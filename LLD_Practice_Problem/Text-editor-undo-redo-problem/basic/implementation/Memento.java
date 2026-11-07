package basic.implementation;

/***
 * Memento
 * Holds a snapshot of the editor's state.
 * It doesn't decide when to save or when to undo.
 */

public class Memento {

    private final String savedText;

    public Memento(String text){
        this.savedText = text;
    }

    public final String getSavedText(){
        return savedText;
    }
}
