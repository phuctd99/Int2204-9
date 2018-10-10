package Cau2;

public class Cirlce extends Shape{
	private double radius = 1.0;
	private double PI = 3.14;
	
	public Cirlce() {
		this.radius = 1.0;
	}
	public Cirlce(double radius) {
		this.radius = radius;
	}
	public Cirlce(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color	= color;
		this.filled	= filled;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
	
	public double getPerimeter() {
		return 2*radius*PI;
	}
	
	public void InFor() {
		System.out.println("Cirlce");
		System.out.println("- Color:\t" + getColor());
		System.out.println("- Filled:\t" + isFilled());
		System.out.println("- Radius:\t" + getRadius());
		System.out.println("- Area:\t\t" + getArea());
		System.out.println("- Perimeter:\t" + getPerimeter());
		
	}
}
