// tinh chu vi, dien tich hinh chu nhat
public class Rectangle extends Shape{
	private double width = 1.0;
	private double length = 1.0;
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
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
		double S = width * length;
		return S;
	}
	public double getPerimeter() {
		double C = (width + length) * 2;
		return C;
	}
	@Override
	public String toString() {
		return(this.getWidth() + "\t " + this.getLength() + "\nChu vi hinh chu nhat: "+this.getPerimeter() + "\nDien tich hinh chu nhat: " +this.getArea());
	}
	public static void main(String[] args) {
		Rectangle HCN = new Rectangle(3.0, 5.0);
		System.out.println(HCN.toString());
	}
	
}
