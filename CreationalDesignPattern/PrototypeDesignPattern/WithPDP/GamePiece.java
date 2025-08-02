package PrototypeDesignPattern.WithPDP;

public class GamePiece implements Prototype<GamePiece> {

    private String color;

    private int position;

    public String getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public GamePiece(String color, int position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public GamePiece clone() {
        return new GamePiece(this.color,this.position);
    }
}
