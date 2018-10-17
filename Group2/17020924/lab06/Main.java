package Exercise;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

abstract class Shape{
	protected int posiX;
	protected int posiY;
	protected String color;
	protected boolean filled;
	public Shape(){
		color = "red";
		filled = true;
		posiX = 100;
		posiY = 100;
	}
	public Shape(int x,int y,String color, boolean filled){
		this.posiX = x;
		this.posiY = y;
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
	public String toStringg() {
		return this.getColor() + " " + this.isFilled();
	}
}
class Circle extends Shape{
	public double radius;
	public double pi = 3.14;
	public Circle(){
		radius = 1.0;
	}
	public Circle(double radius){
		this.radius = radius;
	}
	public Circle(double radius,int x, int y, String color, boolean filled){
		super(x,y,color,filled);
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
	public double width;
	public double length;
	public Rectangle(){
		width = 1.0;
		length = 2.0;
	}
	public Rectangle(double width, double length,int x,int y,String color, boolean filled){
		super(x, y, color, filled);
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
	public double side;
	public Square(){
		side = 3.0;
	}
	public Square(double side){
		this.side = side;
	}
	public Square(double side,int x,int y, String color, boolean filled) {
		super(side, side,x,y, color,filled);
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
class Triangle extends Shape {
    public int side;

    //constructor
    public Triangle() {
        side = 1;
    }

    public Triangle(int side) {
        this.side = side;
    }

    public Triangle(int side, int x, int y, String color, boolean filled) {
        super(x, y, color,filled);
        this.side = side;
    }

    public String toString() {
        return "Triangle: " +
                "side=" + side +
                ", posi=(" + posiX + "," + posiY + ")" +
                ", color='" + color + '\'' +
                ", Filled=" + filled;
    }
}

public class Main extends JFrame implements KeyListener{
	private int x;
	private int y;
	private int dx;
	private int dy;
	public Main() {
		x = 100;
		y = 100;
		dx = 100;
		dy = 100;
		setSize(525,505);
        setVisible(true);
        setLocation(700,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.fillRect(dx, dy, x, y);
	}
	public static void main(String[] args) {
		Main m = new Main();
		Diagram diagram = new Diagram(3);
		
        diagram.addShape(0, new Rectangle());
        diagram.addShape(1, new Circle(1.5, 1, 2, "red", true));
        diagram.addShape(1, new Square());
        diagram.addShape(2, new Triangle());
        diagram.print();
        
        diagram.removeRectangle();
        diagram.removeCircle();
        diagram.removeSquare();
        diagram.removeTriangle();
        diagram.print();
	}
	@Override
	public void keyPressed(KeyEvent ke) {
		
		
	}
	@Override
	public void keyReleased(KeyEvent ke) {
		int keyEvent = ke.getKeyCode();
        switch(keyEvent){
            case KeyEvent.VK_UP:
                dy = dy - 10;
                break;
            case KeyEvent.VK_DOWN:  
            	dy = dy + 10;
                break;
            case KeyEvent.VK_LEFT:
                dx = dx - 10;
                break;
            case KeyEvent.VK_RIGHT:
                dx = dx + 10;
                break;
        }
        repaint();
	}
	@Override
	public void keyTyped(KeyEvent ke) {
		repaint();
		
	}

}

