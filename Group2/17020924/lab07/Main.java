package Exercise;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

abstract class Shape{
	public int posiX;
	public int posiY;
	public String color;
	public boolean filled;
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
	public int radius;
	public double pi = 3.14;
	public Circle(){
		radius = 100;
	}
	public Circle(int radius){
		this.radius = radius;
	}
	public Circle(int radius,int x, int y, String color, boolean filled){
		super(x,y,color,filled);
		this.radius = radius;
	}
	double getRadius() {
		return this.radius;
	}
	double getPi() {
		return this.pi;
	}
	void setRadius(int radius) {
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
	public int width;
	public int length;
	public Rectangle(){
		width = 100;
		length = 200;
	}
	public Rectangle(int width, int length,int x,int y,String color, boolean filled){
		super(x, y, color, filled);
		this.width = width;
		this.length = length;
	}
	double getWidth() {
		return this.width;
	}
	void setWidth(int width) {
		this.width = width;
	}
	double getLength() {
		return this.length;
	}
	void setLength(int length) {
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
	public int side;
	public Square(){
		side = 100;
	}
	public Square(int side){
		this.side = side;
	}
	public Square(int side,int x,int y, String color, boolean filled) {
		super(side, side, x, y, color,filled);
	}
	double getSide() {
		return this.side;
	}
	void setWidth(int side) {
		super.setWidth(side);
	}
	void setLength(int side) {
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
    public int dx;
    public int dy;
    public int dx1;
    public int dy1;
    //constructor
    public Triangle() {
        dx = 200;
        dy = 200;
        dx1 = 200;
        dy1 = 300;
    }

    public Triangle(int dx, int dy, int dx1, int dy1) {
        this.dx = dx;
        this.dy = dy;
        this.dx1 = dx1;
        this.dy1 = dy1;
    }

    public Triangle(int dx, int dy,int dx1,int dy1, int x, int y, String color, boolean filled) {
        super(x, y, color,filled);
        this.dx =dx;
        this.dy =dy;
        this.dx1 = dx1;
        this.dy1 = dy1;
    }

    public String toString() {
        return "Triangle: " +
                ", posi=(" + posiX + "," + posiY + ")" +
                ", color='" + color + '\'' +
                ", Filled=" + filled;
    }
}
class Hexagon extends Shape{
	public int dx1;
	public int dy1;
	public int dx2;
	public int dy2;
	public int dx3;
	public int dy3;
	public int dx4;
	public int dy4;
	public int dx5;
	public int dy5;
	public Hexagon (){
		dx1 = 200;
		dy1 = 100;
		dx2 = 250;
		dy2 = 150;
		dx3 = 200;
		dy3 = 200;
		dx4 = 100;
		dy4 = 200;
		dx5 = 50;
		dy5 = 150;
	}
	public Hexagon(int dx1,int dy1,int dx2,int dy2,int dx3, int dy3,
		int dx4,int dy4,int dx5, int dy5,int x, int y, String color, boolean filled) {
		super(x,y,color,filled);
		this.dx1 = dx1;
		this.dy1 = dy1;
		this.dx2 = dx2;
		this.dy2 = dy2;
		this.dx3 = dx3;
		this.dy3 = dy3;
		this.dx4 = dx4;
		this.dy4 = dy4;
		this.dx5 = dx5;
		this.dy5 = dy5;
	}
	
	public int getDx1() {
		return dx1;
	}
	public void setDx1(int dx1) {
		this.dx1 = dx1;
	}
	public int getDy1() {
		return dy1;
	}
	public void setDy1(int dy1) {
		this.dy1 = dy1;
	}
	public int getDx2() {
		return dx2;
	}
	public void setDx2(int dx2) {
		this.dx2 = dx2;
	}
	public int getDy2() {
		return dy2;
	}
	public void setDy2(int dy2) {
		this.dy2 = dy2;
	}
	public int getDx3() {
		return dx3;
	}
	public void setDx3(int dx3) {
		this.dx3 = dx3;
	}
	public int getDy3() {
		return dy3;
	}
	public void setDy3(int dy3) {
		this.dy3 = dy3;
	}
	public int getDx4() {
		return dx4;
	}
	public void setDx4(int dx4) {
		this.dx4 = dx4;
	}
	public int getDy4() {
		return dy4;
	}
	public void setDy4(int dy4) {
		this.dy4 = dy4;
	}
	public int getDx5() {
		return dx5;
	}
	public void setDx5(int dx5) {
		this.dx5 = dx5;
	}
	public int getDy5() {
		return dy5;
	}
	public void setDy5(int dy5) {
		this.dy5 = dy5;
	}
	
	public String toString() {
        return "Hexagon dx1: " + dx1 + "\n" + "Hexagon dy1: " + dy1;
    }
}

public class Main extends JFrame implements KeyListener{
	Shape shape;
	Circle circle;
	Rectangle rectangle;
	Square square;
	Triangle triangle;
	Hexagon hexagon;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int dx1;
	private int dy1;
	private int dx2;
	private int dy2;
	private int dx3;
	private int dy3;
	private int dx4;
	private int dy4;
	public Main() {
		square = new Square();
		circle = new Circle();
		rectangle = new Rectangle();
		triangle = new Triangle();
		hexagon = new Hexagon();
		x =	hexagon.posiX;
		y = hexagon.posiY;
		dx = hexagon.dx1;
		dy = hexagon.dy1;
		dx1 = hexagon.dx2;
		dy1 = hexagon.dy2;
		dx2 = hexagon.dx3;
		dy2 = hexagon.dy3;
		dx3 = hexagon.dx4;
		dy3 = hexagon.dy4;
		dx4 = hexagon.dx5;
		dy4 = hexagon.dy5;
		setSize(1000,800);
        setVisible(true);
        setLocation(500,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		//Rectangle
		
//		g.fillRect(dx, dy, x, y);
		
		//Square
		
//		g.fillRect(dx, dy, x, x);
		
		//Circle
		
//		g.fillOval(dx, dy, x, x);
		
		//Triangle
		
//		g.drawLine(dx, dy, x, y);
//		g.drawLine(dx, dy, dx1, dy1);
//		g.drawLine(x, y, dx1, dy1);
		
		//Hexagon
		
		g.drawLine(x, y, dx, dy);
		g.drawLine(dx, dy, dx1, dy1);
		g.drawLine(dx1, dy1, dx2, dy2);
		g.drawLine(dx2, dy2, dx3, dy3);
		g.drawLine(dx3, dy3, dx4, dy4);
		g.drawLine(dx4, dy4, x, y);
	}
	public static void main(String[] args) {
		Layer layer = new Layer();
		if (layer.visible == true) {
			Main m = new Main();
		}
		Diagram diagram = new Diagram(5);
		
        diagram.addShape(0, new Rectangle());
        diagram.addShape(1, new Circle(150, 100, 200, "red", true));
        diagram.addShape(2, new Square());
        diagram.addShape(3, new Triangle());
        diagram.addShape(4, new Hexagon());
        diagram.print();
        
        diagram.removeRectangle();
        diagram.removeCircle();
        diagram.removeSquare();
        diagram.removeTriangle();
        diagram.removeHexagon();
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
            	y = y - 10;
                dy = dy - 10;
                dy1 = dy1  - 10;
                dy2 = dy2  - 10;
                dy3 = dy3  - 10;
                dy4 = dy4  - 10;
                break;
            case KeyEvent.VK_DOWN:
            	y = y + 10;
                dy = dy + 10;
                dy1 = dy1  + 10;
                dy2 = dy2  + 10;
                dy3 = dy3  + 10;
                dy4 = dy4  + 10;
                break;
            case KeyEvent.VK_LEFT:
            	x = x - 10;
                dx = dx - 10;
                dx1 = dx1  - 10;
                dx2 = dx2  - 10;
                dx3 = dx3  - 10;
                dx4 = dx4  - 10;
                break;
            case KeyEvent.VK_RIGHT:
            	x = x + 10;
                dx = dx + 10;
                dx1 = dx1  + 10;
                dx2 = dx2  + 10;
                dx3 = dx3  + 10;
                dx4 = dx4  + 10;
                break;
        }
        repaint();
	}
	@Override
	public void keyTyped(KeyEvent ke) {
		
	}

}

