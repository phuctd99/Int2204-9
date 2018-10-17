package Cau2;

public class Square extends Rectangle{
	public Square() {
		this.width = 1.0;
		this.length= 1.0;
	}
	public Square(double side) {
		this.width = side;
		this.length= side;
	}
	public Square(double side, String color, boolean filled) {
		this.width = side;
		this.length = side;
		this.color	= color;
		this.filled	= filled;
	}
	public double getSide() {
		return width;
	}
	public void setSide(double side) {
		this.width = side;
		this.length= side;
	}
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void InFor() {
		System.out.println("Square");
		System.out.println("- Color:\t" + getColor());
		System.out.println("- Filled:\t" + isFilled());
		System.out.println("- Side:\t\t" + getSide());
		System.out.println("- Area:\t\t" + getArea());
		System.out.println("- Perimeter:\t" + getPerimeter());
		
	}
	
}
