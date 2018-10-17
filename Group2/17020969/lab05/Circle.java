/*
 *  Có 3 quan hệ kế thừa:
 *  + Circle kế thừa Shape
 *  + Rectangle kế thừa Shape
 *  + Square kế thừa Rectangle
 *  Circle không kế thừa Rectangle vì trong Rectangle không có các thuộc tính mà Circle cần tới
 *  nên dùng final cho biến PI vì khai báo PI là hằng số
 *  
 */
// tinh chu vi, dien tich hinh tron
public class Circle extends Shape{
	static final double PI = 3.14;
	public double radius = 1.0;
	public Circle() {
		super();
	}
    public Circle(double radius) {
    	super();
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
	public double getArea() {
		double S = radius * radius * PI;
		return S;
	}
	public double getPerimeter() {
		double C = radius * 2 * PI;
		return C;	
	}
	public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Chu vi hinh tron la: " + c.getPerimeter() + "\nDien tich hinh tron la: " + c.getArea());
    }
}
