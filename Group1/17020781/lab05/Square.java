	class Shape{									//Class cha
		protected String color ;
		protected boolean filled ;

		public Shape(){										//Constructor
			this.color = "red";
			this.filled = true;
		}
		public Shape(String color, boolean filled){
			this.color = color;
			this.filled = filled;
		}
		public String getColor(){								//Getter ,Setter
			return this.color;
		}
		public void setColor(String color){
			this.color = color;
		}
		public boolean isFilled(){
			return this.filled;
		}
		public void setFilled(boolean filled){
			this.filled = filled;
		}
		public String toString(){					//thong tin cua class
			return "Shape shape shape";
		}
	}

	class Circle extends Shape{						//Class Con cua Shape 
		protected double radius;
		final double Pi = 3.1415;					//Hang so Pi
		public Circle(){							//Constructor
			this.radius = 1.0;
		}
		public Circle(double radius){
			this.radius = radius;
		}
		public Circle(double radius, String color, boolean filled){
			this(radius);
			super.color = color;
			super.filled = filled;
		}
		public double getRadius(){						//Getter,setter
			return this.radius;
		}
		public void setRadius(double radius){
			this.radius = radius;
		}
		public double getArea(){							//Tinh dien tich
			return Pi*this.radius*this.radius;
		}	
		public double getPerimeter(){					//Tinh chu vi
			return 2*Pi*this.radius;				
		}
		public String toString(){
			return "Circle circle circle";				//Ghi de
		}
	}

	class Rectangle extends Shape{
		protected double width;				//Class con cua class Shape
		protected double length;

		public Rectangle(){							//Constructor
			this.width = 1.0;
			this.length = 1.0;
		}
		public Rectangle(double width, double length){
			this.width = width;
			this.length = length;
		}
		public Rectangle(double width, double length, String color, boolean filled){
			this(width, length);
			super.color = color;
			super.filled = filled;
		}
		public double getWidth(){			//Getter,setter		
			return this.width;
		}
		public double getLength(){
			return this.length;
		}
		public void setWidth(double width){
			this.width = width;
		}
		public void setLength(double length){
			this.length = length;
		}
		public double getArea(){				//Tinh dien tich
			return this.width*this.length;
		}
		public double getPerimeter(){					//Tinh chu vi
			return 2*(this.width + this.length);
		}
		public String toString(){							//Ghi de
			return "Rectangle Rectangle Rectangle";
		}	
	}

	class Square extends Rectangle{				//Class con cua class Rectangle
		public Square(){
			super();
		}
		public Square(double side){							//Cac constructor
			super(side,side);
		}
		public Square(double side, String color, boolean filled){
			this(side);
			this.color = color;
			this.filled = filled;
		}
		public double getSide(){					//Getter,Setter
			return this.width;
		}
		public void setSide(double side){
			this.width = side;
			this.length = side;
		}
		public void setWidth(double side){			//Ghi đè
			this.width = side;
			this.length = side;
		}
		public void setLength(double side){			//ghi de
			this.length = side;
			this.width = side;
		}
		public String toString(){						//Ghi de
			return "Square Square Square";
		}

		public static void main(String[] args) {
			Square square1  = new Square();
			System.out.println(square1.getSide() + " " + square1.getWidth() + " " + square1.getLength());
			square1.setSide(9);
			System.out.println(square1.getSide() + " " + square1.getColor() + " " + square1.isFilled());
			square1.setWidth(10);
			square1.setColor("Black");
			square1.setFilled(true);
			System.out.println(square1.getLength() + " " + square1.getColor() + " " + square1.isFilled());

			Square square2 = new Square(3);
			System.out.println(square2.getSide() + " " + square2.getColor() + " " + square2.isFilled());
			Square square3 = new Square(4, "Red", true);
			System.out.println(square2.getSide() + " " + square3.getColor() + " " + square3.isFilled() + " " + square3.getArea() + " " + square3.getPerimeter());
			System.out.println(square3.toString());	

			Rectangle rectangle1 = new Rectangle(12, 10, "blue", true);
			System.out.println(rectangle1.getArea()+ " " + rectangle1.getPerimeter());
			System.out.println(rectangle1.toString());

			Circle circle1 = new Circle(12, "green", true);
			System.out.println(circle1.getArea() + " " + circle1.getPerimeter() + " " + circle1.getColor() + " " + circle1.isFilled());
			System.out.println(circle1.toString());
			
			Shape shape = new Shape();
			System.out.println(shape.toString());

			Shape circle = new Circle();
			System.out.println(circle.toString());

			Shape rectangle = new Rectangle();
			System.out.println(rectangle.toString());

			Shape square = new Square();
			System.out.println(square.toString());
		}
	}