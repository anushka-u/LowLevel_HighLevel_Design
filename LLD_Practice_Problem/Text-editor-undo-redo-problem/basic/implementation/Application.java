package basic.implementation;

import java.util.Scanner;

public class Application {

    static void main() {

        Scanner scn = new Scanner(System.in);

        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(editor);

        while (scn.hasNextLine()) {
            String operation = scn.nextLine().trim();
            if (operation.equals("exit")) {
                break;
            }

            switch (operation) {
                case "input" -> {
                    if (scn.hasNextLine()) {
                        caretaker.insert(scn.nextLine());
                    } else {
                        IO.println("Missing text for input operation");
                        return;
                    }
                }
                case "undo" -> caretaker.undo();
                case "redo" -> caretaker.redo();
                default -> {IO.println("Selected operation is not in option");}
            }
        }

        IO.println(caretaker.getText());
    }
}
