package lab05;

public class Lab05_b2 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setColor("blue");
        shape.setFilled(true);
        System.out.println(shape.toString());
        
        Circle circle = new Circle(3, "red", true);
        System.out.println(circle.toString());
        
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setColor("green");
        rectangle.setFilled(false);
        System.out.println(rectangle.toString());
        
        Square square = new Square(5);
        square.setColor("black");
        square.setFilled(true);
        System.out.println(square.toString());
    }
}

class Shape {
    private String color;
    private boolean filled;
    
    // constructor

    public Shape() {
        color = "red";
        filled = true;
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    // the hien ra
    public String toString() {
        if (isFilled()) {
            return ("Hinh co mau " + getColor() + " va duoc lap day");
        }
        else {
            return ("Hinh co mau " + getColor() + " nhung khong duoc lap day");
        }
    }
}

// class Circle thua ke class Shape
class Circle extends Shape {
    private final double PI = 3.1415926;
    private double radius;
    // constructor
    public Circle() {
        radius = 0;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    // getter & setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // lay dien tich
    public double getArea() {
        return PI*radius*radius;
    }
    
    // lay chu vi
    public double getPerimeter() {
        return 2*PI*radius;
    }
    // the hien ra
    @Override
    public String toString() {
        return ( "Hinh tron co ban kinh " + getRadius() + ", dien tich la " +
                getArea() + ", chu vi la " + getPerimeter() 
                + "\n" + super.toString() );
    }
    
}

class Rectangle extends Shape {
    public double width;
    public double length;
    // constructor
    public Rectangle() {
        width = 1.0;
        length = 1.0;
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
    
    // getter & setter

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
    // lay dien tich
    public double getArea() {
        return length*width;
    }
    // lay chu vi
    public double getPerimeter() {
        return 2*(length + width);
    }
    
    // the hien ra
    @Override 
    public String toString() {
        return ( "Hinh chu nhat co chieu dai " + getLength()
            + ", chieu rong la " + getWidth() + ", dien tich la " +
                getArea() + ", chu vi la " + getPerimeter()
                + "\n" + super.toString() );
    }
}

// class Square thua ke hinh chu nhat
class Square extends Rectangle {
    // constructor
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    // getter & setter
    public double getSide() {
        return super.getWidth();
    }
    
    public void setSize(double side) {
        super.setWidth(side);
    }
    
    @Override 
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    @Override 
    public void setLength(double side) {
        super.setLength(side);
    }
    
    @Override 
    public String toString() {
        if (super.isFilled()) {
            return ( "Hinh vuong co canh dai " + getSide() + ", dien tich la "
                      + super.getArea() + ", chu vi la " + super.getPerimeter() 
                      + "\n" + "Hinh co mau " + super.getColor() + " duoc lap day");
        }
        else 
            return ( "Hinh vuong co canh dai " + getSide() + ", dien tich la "
                      + super.getArea() + ", chu vi la " + super.getPerimeter() 
                      + "\n" + "Hinh co mau " + super.getColor() + ", khong duoc lap day");
        
    }
    
}

