package HinhHoc;

public class Circle extends Shape{
	private double radius = 1.0;
	private final double pi = Math.PI;
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {		
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// tính diện tích
	public double getArea() {
		return pi * this.radius * this.radius;
	}
	// tính chu vi
	public double getPerimeter() {
		return 2*pi*this.radius;
	}
	
	public String toString() {
		return "Hình tròn có chu vi: " + getPerimeter() + "\nDiện tích: " + getArea() + "\nMàu: " + super.toString();
	}
}