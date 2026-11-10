package cursor.management;

public class TextEditor {

    private String text = "";
    private int cursorPostion = 0;

    public void insert(String input){
        //It will insert the text at the position where cursor is -
        this.text = text.substring(0,cursorPostion)+ input  +text.substring(cursorPostion);
        //will increase or move the cursor.
        cursorPostion+= input.length();
    }

    public void  moveCursorToRequiredPosition(int position){
        if(position<0 || position > text.length()){
             throw new RuntimeException("Invalid cursor position");
        }
        cursorPostion = position;
    }

    public String getText(){
        return  text;
    }

    public int getCursorPostion(){
        return  cursorPostion;
    }

    public Memento createMemento(){
        return new Memento(text, cursorPostion);
    }

    public void restoreMemento(Memento memento){
        text = memento.getSavedText();
        cursorPostion = memento.getCursorPostion();
    }
}
