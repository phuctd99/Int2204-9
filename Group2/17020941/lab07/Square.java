package oop_tuan6;

public class Square extends Rectangle {
	boolean isSquare = true;
    public Square() {
    }
    public Square(int side) {
        super(side, side);
    }
    public Square(int x, int y, String color, int side) {
        super(x, y, color, side, side);
    }
    public int getSide() {
        return this.width;
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(int side) {
        this.setSide(side);
    }
    @Override
    public boolean getIsSquare() {
		return true;
	}
    @Override
    public void setLength(int side) {
        this.setSide(side);
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}