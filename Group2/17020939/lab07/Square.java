package bttuan7;

public class Square extends Rectangle {
    public Square() {}

    public Square(Point top_left, Point top_right, Point bot_left, Point bot_right) {
        super(top_left, top_right, bot_left, bot_right);
    }

    public Square(String color, boolean filled, Point top_left, Point bot_right) {
        super(color, filled, top_left, bot_right);
    }
}