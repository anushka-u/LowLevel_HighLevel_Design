package MementoDesignPattern.ProblemStatement;

public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor textEditor =  new TextEditor();
        textEditor.write("Hello World");
        textEditor.write("Hello Everyone");
        /* Here HEllo Everyone will print as it will override the Hello World, so
        to print Hello World user want to undo Hello Everyone or to be more precise
        the user want to have the undo and redo functionality on this text editor, how will we achieve it?
        */
        System.out.println(textEditor.getContent());
    }
}
