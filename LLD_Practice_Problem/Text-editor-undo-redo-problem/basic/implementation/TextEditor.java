package basic.implementation;

/***
 * TextEditor
 *
 * Owns the actual document.
 * - Insert text
 * - Return current text
 * - Create a snapshot
 * - Restore from a snapshot
 */
public class TextEditor {

    private String text = "";

    public void insert(String input) {
        this.text = text + " " + input;
    }

    public Memento createMemento() {
        return new Memento(String.valueOf(text));
    }

    public void restore(Memento memento) {
        text = memento.getSavedText();
    }

    public String getText() {
        return text;
    }
}