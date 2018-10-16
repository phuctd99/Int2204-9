import java.util.*;
import java.io.*;

class Diagram {
	public ArrayList<Layer> listLayer = new ArrayList<Layer>();
	Diagram(){
		
	}

	public void createLayer(){
		Layer layerNew = new Layer();
		listLayer.add(layerNew);
	}
	public Layer select(){
		Scanner input = new Scanner(System.in);
		System.out.print("Layer Number :");
		int select = input.nextInt();
		return listLayer.get(select - 1);
	}
	public void deletee(){
		for(int i = 0; i < listLayer.size(); ++i){
			listLayer.get(i).deleteCircle();
		}
	}
	public void menu(){
		boolean exit = false;
		while(!exit){
			System.out.println("1.Create a layer");
			System.out.println("2.Select a layer");
			System.out.println("3.Delete Circle");
			System.out.println("4.Exit");
			Scanner input = new Scanner(System.in);
			int select = input.nextInt();
			switch(select){
				case 1 :
					this.createLayer();
					break;
				case 2 :
					Layer temp = new Layer();
					temp = this.select();
					temp.menuShape();
					break;
				case 3 :
					this.deletee();
					break;
				default :
					exit = true;
					break;
			}
		}
		
	}
}

class Layer {
	public ArrayList<Shape> listShape = new ArrayList<>();
	Layer(){
	}
	public void createNewShape(){
		boolean exit = true;
		while(exit){
			System.out.println("Create : 1.Rectangle 2.Square 3.Triangle 4.Circle 5.Back");
			int temp;
			Scanner input = new Scanner(System.in);
			temp = input.nextInt();
			switch(temp){
				case 1 :
					Rectangle recNew = new Rectangle();	
                    listShape.add(recNew);
					break;
				case 2 :
					Shape shapeNew2 = new Square();
					if(shapeNew2 instanceof Square){			//Downcasting
						Square squNew = (Square) shapeNew2;
                        listShape.add(squNew);
					}
					break;
				case 3 :
					Shape shapeNew3 = new Triangle();
                        listShape.add(shapeNew3);
					break;
				case 4 :
					Shape shapeNew4 = new Circle();
					if(shapeNew4 instanceof Circle){
						Circle cirNew = (Circle) shapeNew4;
                        listShape.add(cirNew);
					}	
					break;
				case 5 :
					exit = false;
					break;
				default : 
					System.out.println("Không hình nào được tạo");
					break;
			}
		}
	}	
	public Shape selectShape(){
		Scanner input = new Scanner(System.in);
		System.out.print("Shape number :");
		int select = input.nextInt();
		return listShape.get(select - 1);
	}
	public void filled(Shape shape){
		shape.setFilled();
	}
	public void setSizeShape(Shape shape){
		shape.setSize();
	}
	public void move(Shape shape){
		shape.setPosition();
	}
	public void info(Shape shape){
		shape.toString1();
	}
	public void deleteRectangle(){
		for(int i =0; i < listShape.size(); ++i){
			if(listShape.get(i) instanceof Rectangle){
				listShape.remove(i);
			}
		}
	}
	public void deleteCircle(){
		for(int i =0; i < listShape.size(); ++i){
			if(listShape.get(i) instanceof Circle){
					listShape.remove(i);
			}
		}
	}
	public void menuShape(){
		boolean exit = false;
		while(!exit){
			System.out.println("1.Create");
			System.out.println("2.Fill");
			System.out.println("3.Set size");
			System.out.println("4.Move");
			System.out.println("5.Print");
			System.out.println("6.Print All");
			System.out.println("7.Delete Rectangle");
			System.out.println("8.Back");
			Scanner input = new Scanner(System.in);
			int select = input.nextInt();
			switch(select){
				case 1 :
					this.createNewShape();
					break;
				case 2 :
					this.filled(this.selectShape());
					break;
				case 3 :
					this.setSizeShape(this.selectShape());
					break;
				case 4 :
					this.move(this.selectShape());
					break;
				case 5 :
					this.info(this.selectShape());
					break;
				case 6 :
					for (int i = 0; i < listShape.size() ; ++i) {
						this.info(listShape.get(i));
					}
					break;
				case 7 :
					this.deleteRectangle();
					break;
				default : 
					exit = true;
					break;
			}
		}
	}
}

abstract class Shape{
	protected double x,y;
	protected boolean filled;
	Shape(){
		this.x = 0;
		this.y = 0;
		filled = false;
	}
	Shape(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void setFilled(){
		this.filled = true;
	}
	public void setPosition()
	{	
		System.out.print("posX = ");
		Scanner input = new Scanner(System.in);
		double _x = input.nextDouble();
		System.out.print("posY = ");
		Scanner input2 = new Scanner(System.in);
		double _y = input2.nextDouble();
		this.x = _x;
		this.y = _y;
	}
	public abstract void setSize();
	public abstract void toString1();
}

class Rectangle extends Shape{
	public double width;
	public double length;
	Rectangle(){
		this.width = 0;
		this.length = 0;
	}
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
        @Override
	public void setSize(){
		Scanner input = new Scanner(System.in);
		System.out.print("Width = ");
		double _width = input.nextDouble();
		Scanner input2 = new Scanner(System.in);
		System.out.print("Length = ");
		double _length = input2.nextDouble();
		this.width = _width;
		this.length = _length;
	}
        @Override
	public void toString1(){
		System.out.println("Rectangle"+" "+width+" "+length+" "+x + " " + y +" "+filled);
	}
}

class Square extends Shape{
	public double size;
	Square(){
		this.size = 0;
	}
	Square(double size){
		this.size = size;
	}
        @Override
	public void setSize(){
		Scanner input = new Scanner(System.in);
		System.out.print("Size = ");
		double _size = input.nextDouble();
		this.size = _size;
	}
        @Override
	public void toString1(){
		System.out.println("Square"+ " " +size+ " " +x + " " + y +" "+filled);
	}
}

class Triangle extends Shape{
	public double height;
	public double base;
	Triangle(){
		this.height = 0;
		this.base = 0;
	}
	Triangle(double height, double base){
		this.height = height;
		this.base = base;
	}
        @Override
	public void setSize(){
		Scanner input = new Scanner(System.in);
		System.out.print("Height = ");
		double _height = input.nextDouble();
		Scanner input2 = new Scanner(System.in);
		System.out.print("base = ");
		double _base = input2.nextDouble();
		this.height = _height;
		this.base = _base;
	}
        @Override
	public void toString1(){
		System.out.println("Triangle"+" "+height+" "+base+" "+x + " " + y +" "+filled);
	}
}

class Circle extends Shape{
	public double radius;
	Circle(){
		this.radius = 0;
	}
	Circle(double radius){
		this.radius = radius;
	}
        @Override
	public void setSize(){
		Scanner input = new Scanner(System.in);
		System.out.print("radius = ");
		double _radius = input.nextDouble();
		this.radius = _radius;
	}
        @Override
	public void toString1(){
		System.out.println("Circle"+" "+radius+ " " + x + " " + y +" "+filled);
	}
}

public class Test{
	public static void main(String[] args) {
		// Shape shape = new Rectangle();
		// Rectangle rec1 = (Rectangle) shape;
		// Square squ1 = (Square) shape;
		// Triangle tri1 = (Triangle) shape;
		// Circle cir1 = (Circle) shape;
		Diagram run = new Diagram();
		run.menu();
	}
}