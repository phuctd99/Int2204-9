package HinhHoc;

public class Rectangle extends Shape{
	protected double width = 1.0;
	protected double length = 1.0;
	
	
	
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super.color = color;
                super.filled = filled;
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
	// tính diện tích
	public double getArea() {
		return this.length*this.width;
	}
	// tính chu vi
	public double getPerimeter() {
		return (this.length+this.width)*2;
	}
	public String toString() {
		return "Hình CN có chu vi: " + getPerimeter() + "\nDiện tích: " + getArea() + "\nMàu: " + super.toString();
	}
}