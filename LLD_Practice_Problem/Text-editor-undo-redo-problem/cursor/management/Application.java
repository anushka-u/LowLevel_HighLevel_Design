package cursor.management;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(editor);

        String command;

        System.out.println("===== TEXT EDITOR =====");
        System.out.println("Commands:");
        System.out.println("insert <text>");
        System.out.println("move <position>");
        System.out.println("undo");
        System.out.println("redo");
        System.out.println("show");
        System.out.println("exit");

        while (true) {

            System.out.print("\nEnter command: ");
            command = sc.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Text Editor...");
                break;
            }

            if (command.startsWith("insert ")) {

                String input = command.substring(7);
                caretaker.insert(input);

            } else if (command.startsWith("move ")) {

                int position = Integer.parseInt(command.substring(5));
                caretaker.moveCursorToRequiredPosition(position);

            } else if (command.equalsIgnoreCase("undo")) {

                caretaker.insertIntoUndo();

            } else if (command.equalsIgnoreCase("redo")) {

                caretaker.redoStack();

            } else if (command.equalsIgnoreCase("show")) {

                System.out.println("Current Text: " + caretaker.getContent());

            } else {

                System.out.println("Invalid command!");
            }

            System.out.println("Text: " + caretaker.getContent());
            System.out.println("Cursor Position: " + editor.getCursorPostion());
            System.out.println("Length of input String "+ caretaker.getContent().length());
        }

        sc.close();
    }

}
