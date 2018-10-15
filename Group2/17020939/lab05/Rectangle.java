package Cau2;

public class Rectangle extends Shape {
	public double width = 1.0;
	public double length= 1.0;
	
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		this.color	= color;
		this.filled	= filled;
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
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(width + length);
	}
	
	public void InFor() {
		System.out.println("Cirlce");
		System.out.println("- Color:\t" + getColor());
		System.out.println("- Filled:\t" + isFilled());
		System.out.println("- Width:\t" + getWidth());
		System.out.println("- Length:\t" + getLength());
		System.out.println("- Area:\t\t" + getArea());
		System.out.println("- Perimeter:\t" + getPerimeter());
		
	}
}
