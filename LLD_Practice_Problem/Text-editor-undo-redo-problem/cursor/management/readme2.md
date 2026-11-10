Cursor Management — Implementation 02
1. Problem statement
   The existing editor supports inserting text only at the end of the document.

We want to extend it so that:
- The cursor can be moved to any valid position in the document.
- Text is inserted at the current cursor position.
- After insertion, the cursor moves to the end of the newly inserted text.
- Undo/redo restores both the document and cursor position.
2. Basic approach
   Maintain two pieces of state in TextEditor:
   document       → The current text
   cursorPosition → The current cursor index


The cursor position is an integer between 0 and document.length().

Example:
Document: "Hello World"
Hello| World
cursorPosition = 5

The cursor is between o and the space.
3. Pseudocode
   A. Move cursor
   METHOD moveCursor(position)

   IF position < 0 OR position > document.length
   THROW invalid position
   END IF

   cursorPosition = position

END METHOD


B. Insert text
METHOD insert(input)

    document = document.substring(0, cursorPosition)
               + input
               + document.substring(cursorPosition)

    cursorPosition = cursorPosition + input.length

END METHOD


C. Create Memento
Since cursor position is part of the editor state, save both:
METHOD createMemento()

    RETURN Memento(
        document,
        cursorPosition
    )

END METHOD


D. Restore Memento
METHOD restore(memento)

    document = memento.savedDocument
    cursorPosition = memento.savedCursorPosition

END METHOD


4. Example walkthrough
   Initial document:
   Hello World


Move cursor to position 5:
Hello| World


Insert "Beautiful":
HelloBeautiful| World


Undo:
Hello| World


Redo:
HelloBeautiful| World


Notice that undo restores the cursor to position 5, not necessarily the end of the document.
5. Design changes from basic implementation
   Component	Basic implementation	Cursor implementation
   TextEditor	Stores document	Stores document + cursor
   Insert	Append text	Insert at cursor
   Memento	Stores text	Stores text + cursor
   Caretaker	Manages snapshots	Same responsibility
   Main	Accepts insert/undo/redo	Also accepts cursor movement

6. Complexity
   For this implementation, assume the document is stored as a Java String.
   Operation	Complexity
   Move cursor	O(1)
   Insert text at cursor	O(n + m)
   Create Memento	O(n)
   Restore Memento	O(n)

Where:
- n = document length
- m = inserted text length
  Insertion requires copying parts of the string, so it can be expensive for large documents.

This is intentional for now. We'll first make cursor management work correctly. In the next implementation, we can replace the underlying text representation with a Gap Buffer and compare the performance.



## Basic vs Cursor Management

| Feature           | Basic implementation  | Cursor management     |
| ----------------- | --------------------- | --------------------- |
| Insert text       | Only at end           | At any position       |
| Cursor position   | Always at end         | Can move anywhere     |
| Insert in middle  | Not supported         | Supported             |
| Undo/redo         | Snapshot-based        | Snapshot-based        |
| Memory efficiency | Stores full snapshots | Stores full snapshots |
| Insert complexity | O(n) with String      | O(n) with String      |


## Cursor management improves functionality, not memory efficiency.
- Basic implementation: Insert text only at the end.
- Cursor management: Move the cursor anywhere and insert text at that position.
- Memory usage: Both still use String and store complete text snapshots in the undo/redo stacks, so memory consumption is similar.