package Week7;

import java.awt.Color;

public class Hexagon extends Shape {
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	private Point point5;
	private Point point6;

	public Hexagon() {
		super();
	}

	public Hexagon(Point point1, Point point2, Point point3, Point point4, Point point5, Point point6) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
		this.point5 = point5;
		this.point6 = point6;
	}

	public Hexagon(String color, boolean isFilled, Point point1, Point point2, Point point3, Point point4, Point point5,
			Point point6) {
		super(color, isFilled);
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
		this.point5 = point5;
		this.point6 = point6;
	}

	public void resize(Point point1, Point point2, Point point3, Point point4, Point point5, Point point6) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
		this.point5 = point5;
		this.point6 = point6;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public Point getPoint4() {
		return point4;
	}

	public void setPoint4(Point point4) {
		this.point4 = point4;
	}

	public Point getPoint5() {
		return point5;
	}

	public void setPoint5(Point point5) {
		this.point5 = point5;
	}

	public Point getPoint6() {
		return point6;
	}

	public void setPoint6(Point point6) {
		this.point6 = point6;
	}
	public double getArea() {
		// tính độ dài 1 cạnh rồi áp dụng công thức
		double doDaiCanh = Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX()) 
				+ (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()));
		double dienTich = (Math.pow(3, 1/2) * 3 * doDaiCanh * doDaiCanh) / 2;
		return dienTich;
	}
	public double getPerimeter() {
		double doDaiCanh = Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX()) 
				+ (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()));
		double chuVi = doDaiCanh*6;
		return chuVi;
	}

	public void move(int x, int y) {
		point1.setX(point1.getX() + x);
		point1.setY(point1.getY() + y);
		point2.setX(point2.getX() + x);
		point2.setY(point2.getY() + y);
		point3.setX(point3.getX() + x);
		point3.setY(point3.getY() + y);
		point4.setX(point4.getX() + x);
		point4.setY(point4.getY() + y);
		point5.setX(point5.getX() + x);
		point5.setY(point5.getY() + y);
		point6.setX(point6.getX() + x);
		point6.setY(point6.getY() + y);
        
	}


}