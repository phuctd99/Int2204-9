package bai2;

public class Rectangle extends shape{
	private double width;
	private double length;
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return this.length * this.width;
	}
	public double getPerimeter() {
		return 2 * ((this.length + this.width));
	}
	public String toString() {
		return super.toString() + "," + this.width + "," + this.width;
	}
}
