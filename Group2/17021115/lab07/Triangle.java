package Week7;

import java.awt.Graphics;
import java.util.Arrays;

public class Triangle extends Shape {
	private Point diemA;
	private Point diemB;
	private Point diemC;

	public Triangle() {
	}

	public Triangle(Point diemA, Point diemB, Point diemC) {
		super();
		this.diemA = diemA;
		this.diemB = diemB;
		this.diemC = diemC;
	}

	public Triangle(String color, boolean filled, Point diemA, Point diemB, Point diemC) {
		super(color, filled);
		this.diemA = diemA;
		this.diemB = diemB;
		this.diemC = diemC;
	}

	public Point getDiemA() {
		return diemA;
	}

	public void setDiemA(Point diemA) {
		this.diemA = diemA;
	}

	public Point getDiemB() {
		return diemB;
	}

	public void setDiemB(Point diemB) {
		this.diemB = diemB;
	}

	public Point getDiemC() {
		return diemC;
	}

	public void setDiemC(Point diemC) {
		this.diemC = diemC;
	}

	public double getArea() {
		return Math.abs((diemB.getX() - diemA.getX()) * (diemC.getY() - diemA.getY())
				- (diemC.getX() - diemA.getX()) * (diemB.getY() - diemA.getY()));
	}

	public double getPerimeter() {
		return Math
				.sqrt((diemA.getX() - diemB.getX()) * (diemA.getX() - diemB.getX())
						+ (diemA.getY() - diemB.getY()) * (diemA.getY() - diemB.getY()))
				+ Math.sqrt((diemA.getX() - diemC.getX()) * (diemA.getX() - diemC.getX())
						+ (diemA.getY() - diemC.getY()) * (diemA.getY() - diemC.getY()))
				+ Math.sqrt((diemB.getX() - diemC.getX()) * (diemB.getX() - diemC.getX())
						+ (diemB.getY() - diemC.getY()) * (diemB.getY() - diemC.getY()));
	}

	public void move(int x, int y) {
		diemA.setX(diemA.getX() + x);
		diemA.setY(diemA.getY() + y);
		diemB.setX(diemB.getX() + x);
		diemB.setY(diemB.getY() + y);
		diemC.setX(diemC.getX() + x);
		diemC.setY(diemC.getY() + y);
	}
}