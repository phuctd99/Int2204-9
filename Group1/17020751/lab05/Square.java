package bai2;

public class Square extends Rectangle {

    public Square() {
    }
    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled) {
        super.setLength(side);
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide() {
        return super.getLength();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square {" + "color=" + color + ", side = " + getSide() + ", filled=" + filled + "}";
    }
}
