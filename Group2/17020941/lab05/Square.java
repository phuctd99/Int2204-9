package bai2;

public class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(color, filled, side, side);
	}
	public double getSide() {
		return this.getLength();
	}
	public void setSide(double size) {
		super.setLength(size);
		super.setWidth(size);
	}
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	public String toString() {
		return "side: " + this.getSide() + " dien tich: " + this.getArea();
	}
}
