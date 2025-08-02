package PrototypeDesignPattern.WithPDP;

public class GameClient {

    public static void main(String[] args) {
        GameBoard board = new GameBoard();
       board.addPiece(new GamePiece("White",4));
       board.addPiece(new GamePiece("Black",7));

       board.showBoradState();

       GameBoard copiedBoard  = board.clone();
        System.out.println("Copied Object");
        copiedBoard.showBoradState();

    }
}
