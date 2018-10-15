package bai2;

public class Circle extends shape {
	private double radius;
	private final double PI = 3.14;
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle (double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPerimeter() {
		return 2 * PI * radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
	public String toString() {
		return "chu vi: " + this.getPerimeter() + "\tdien tich:" + this.getArea();
	}
}
