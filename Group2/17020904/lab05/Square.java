package Lab052;
public class Square extends Rectangle {
    public double side;
    //Khoi tao
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    //
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
