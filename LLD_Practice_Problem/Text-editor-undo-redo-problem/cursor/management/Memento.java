package cursor.management;

public class Memento {

    private final String text;
    private final int cursorPostion;
    public Memento(String text, int cursorPostion) {
        this.text = text;
        this.cursorPostion = cursorPostion;
    }

    public String getSavedText() {
        return text;
    }

    public  int getCursorPostion() {
        return cursorPostion;
    }
}
