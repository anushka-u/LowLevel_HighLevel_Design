# Problem 01: Text Editor with Undo and Redo

## Problem Statement

Design and implement a simple text editor that allows users to insert and delete text, move the cursor, and undo or redo their editing operations.

The editor should maintain the current document state and allow users to navigate through their editing history without losing track of their changes.

The initial implementation should focus on correctness, clean object-oriented design, and testability. Performance optimizations will be explored in subsequent implementations.

## Functional Requirements

1. **Insert Text:** Insert a character or string at the current cursor position.
2. **Delete Text:** Delete a specified number of characters before or after the cursor.
3. **Move Cursor:** Move the cursor left or right within the document boundaries.
4. **Undo:** Reverse the most recent editing operation.
5. **Redo:** Reapply an operation that was previously undone.
6. **View Document:** Display the current document content.
7. **View Cursor Position:** Return the current cursor position.
8. **New Edit After Undo:** If a new editing operation occurs after undo, invalidate the existing redo history.
9. **Empty History Handling:** Undo and redo should behave safely when their respective histories are empty.
10. **Boundary Handling:** Prevent invalid cursor positions and invalid deletion ranges.

## Initial Constraints

- Implement a single-user, in-memory text editor.
- Use a console-based interface or a simple test driver; no GUI is required.
- Support ordinary text insertion and deletion.
- Do not implement file saving, formatting, multiple cursors, or collaborative editing.
- Keep the design extensible so that the internal text storage and history mechanisms can be replaced later.

## Acceptance Criteria

- Text can be inserted at the beginning, middle, or end of a document.
- Text can be deleted and subsequently restored through undo.
- Redo correctly reapplies an undone operation.
- Multiple consecutive undo and redo operations work correctly.
- Performing a new edit after undo clears the invalid redo history.
- Cursor movement and deletion respect document boundaries.
- The implementation includes unit tests for normal cases and edge cases.

## Future Exploration

After the basic implementation is complete, investigate alternative approaches:

1. Snapshot-based undo/redo using the basic.implementation.Memento pattern.
2. Operation-based undo/redo using reversible commands.
3. Cursor management and Gap Buffer.
4. Piece Table for text storage.
5. Rope for large-document editing.
6. Memory consumption, time complexity, and trade-offs between approaches.