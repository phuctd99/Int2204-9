package Lab06;
public class Square extends Rectangle {

    private double side;

    public Square(int _x, int _y, boolean movable, boolean filled, double side) {
        super(_x, _y, movable, filled, side, side);
    }
}
