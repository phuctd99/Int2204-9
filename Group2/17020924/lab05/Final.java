package ex2;

class Shape{
	private String color;
	private boolean filled;
	Shape(){
		color = "red";
		filled = true;
	}
	Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	String getColor() {
		return this.color;
	}
	void setColor(String color) {
		this.color = color;
	}
	boolean isFilled() {
		return this.filled;
	}
	void setFilled(boolean filled) {
		this.filled = filled;
	}
	String toStringg() {
		return this.getColor() + " " + this.isFilled();
	}
}
class Circle extends Shape{
	private double radius;
	final double pi = 3.14;
	Circle(){
		radius = 1.0;
	}
	Circle(double radius){
		this.radius = radius;
	}
	Circle(double radius, String color, boolean filled){
		super(color,filled);
		this.radius = radius;
	}
	double getRadius() {
		return this.radius;
	}
	double getPi() {
		return this.pi;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	double getArea() {
		return this.radius*this.radius*this.pi;
	}
	double getPerimeter() {
		return 2*this.pi*this.radius;
	}
	public String toString() {
		return this.radius + " " + this.pi;
	}
}
class Rectangle extends Shape{
	private double width;
	private double length;
	Rectangle(){
		width = 1.0;
		length = 2.0;
	}
	Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	double getWidth() {
		return this.width;
	}
	void setWidth(double width) {
		this.width = width;
	}
	double getLength() {
		return this.length;
	}
	void setLength(double length) {
		this.length = length;
	}
	double getArea() {
		return this.width*this.length;
	}
	double getPerimeter() {
		return 2*(this.width + this.length);
	}
	public String toString() {
		return this.width + " " + this.length;
	}
}
class Square extends Rectangle{
	private double side;
	Square(){
		side = 3.0;
	}
	Square(double side){
		this.side = side;
	}
	Square(double side, String color, boolean filled) {
		super(side, side, color,filled);
	}
	double getSide() {
		return this.side;
	}
	void setWidth(double side) {
		super.setWidth(side);
	}
	void setLength(double side) {
		super.setLength(side);
	}
	double getArea() {
		return super.getArea();
	}
	public String toString() {
		return "S: " + this.side*this.side;
	}
}

public class Final {

	public static void main(String[] args) {
		Square sq = new Square();
		Circle ci = new Circle();
		Rectangle rec = new Rectangle();
		System.out.println(sq.toString());
		System.out.println(ci.toString());
		System.out.println(rec.toString());
	}

}
