package PrototypeDesignPattern.WithoutPDP;

public class GameClient {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("White",1));
        gameBoard.addPiece(new GamePiece("Black",3));
        gameBoard.addPiece(new GamePiece("White", 5));
        gameBoard.addPiece(new GamePiece("Black",6));

        gameBoard.showBoradState();
        
        //Suppose we want to checkpoint this state and want to save like stack object or want to built redo undo functionality
        GameBoard copiedPiece =  new GameBoard();
        for(GamePiece piece : gameBoard.getPieces()){
            copiedPiece.addPiece(new GamePiece(piece.getColor(),piece.getPosition()));
        }

        System.out.println("Copied Pieces");
        copiedPiece.showBoradState();
    }
}
