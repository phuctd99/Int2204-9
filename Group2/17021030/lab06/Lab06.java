package lab06;

import java.util.ArrayList;

public class Lab06 {

    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        diagram.setName("Lab06");
        diagram.setDateModified("15/10/2018");
        // tao ra ba hinh tron
        Position I_1 = new Position(0, 0);
        Position I_2 = new Position(5, 1);
        Position I_3 = new Position(4, -2);
        Circle cir_1 = new Circle(1, I_1);
        Circle cir_2 = new Circle(3, I_2);
        Circle cir_3 = new Circle(1.5, I_3);
        // tao ra 2 hinh vuong
        Position Squr1_V1 = new Position(9, 3);
        Position Squr1_V2 = new Position(11, 4);
        Position Squr1_V3 = new Position(10, 6);
        Position Squr1_V4 = new Position(8, 5);
        Square Squr1 = new Square(Squr1_V1, Squr1_V2, Squr1_V3, Squr1_V4);
            // xong hinh vuong 1
        Position Squr2_V1 = new Position(10, 2);
        Position Squr2_V2 = new Position(13, 2);
        Position Squr2_V3 = new Position(13, -1);
        Position Squr2_V4 = new Position(10, -1);
        Square Squr2 = new Square(Squr2_V1, Squr2_V2, Squr2_V3, Squr2_V4);
            // xong hinh vuong 2
            
        // tao ra 1 hinh chu nhat
        Position Rectgl1_V1 = new Position(9, -2);
        Position Rectgl1_V2 = new Position(12, -5);
        Position Rectgl1_V3 = new Position(11, -6);
        Position Rectgl1_V4 = new Position(8, -3);
        Rectangle Rectgl1 = new Rectangle(Rectgl1_V1, Rectgl1_V2, Rectgl1_V3, Rectgl1_V4);
            // xong hinh chu nhat
        // tao ra 3 tam giac
        Position Triagl1_V1 = new Position(-3, -3);
        Position Triagl1_V2 = new Position(-1, -5);
        Position Triagl1_V3 = new Position(4, -5);
        Triangle Triagl1 = new Triangle(Triagl1_V1, Triagl1_V2, Triagl1_V3);
            // xong hinh tam giac 1
        Position Triagl2_V1 = new Position(-2, 1);
        Position Triagl2_V2 = new Position(2, 3);
        Position Triagl2_V3 = new Position(-1, 5);
        Triangle Triagl2 = new Triangle(Triagl2_V1, Triagl2_V2, Triagl2_V3);
            // xong hinh tam giac 2
        Position Triagl3_V1 = new Position(3, 6);
        Position Triagl3_V2 = new Position(3, 4);
        Position Triagl3_V3 = new Position(4, 4);
        Triangle Triagl3 = new Triangle(Triagl3_V1, Triagl3_V2, Triagl3_V3);
            // xong hinh tam giac 3
        
        // cho hinh tron 1, hinh chu nhat, hinh tron 2 vao layer_0
        // hai hinh vuong 1, 2 va hai hinh tam giac 1, 2 vao layer_1
        // cho hinh tam giac 3 va hinh tron 3 vao layer_2
        Layer layer_0 = new Layer();
        layer_0.add(cir_1);
        layer_0.add(Rectgl1);
        layer_0.add(2, cir_2);
        
        Layer layer_1 = new Layer();
        layer_1.add(Squr1);
        layer_1.add(Triagl2);
        layer_1.add(1, Triagl1);
        layer_1.add(Squr2);
        
        Layer layer_2 = new Layer();
        layer_2.add(Triagl3);
        layer_2.add(cir_3);
        
        // add tung layer vao diagram
        diagram.add(layer_0);
        diagram.add(layer_1);
        diagram.add(layer_2);
        
        // kiem tra phuong thuc removeTriangle cua class Layer
        System.out.println("So phan tu cua layer_1 la " + layer_1.getArr_Shape_size());
        System.out.println("Xoa cac tam giac trong layer_1...");
        layer_1.removeTriangle();
        System.out.println("Sau khi xoa, layer_1 con lai " + layer_1.getArr_Shape_size() + " phan tu");
        
        // kiem tra phuong thuc removeAllCircles cua class Diagram
        // layer_0 2 hinh tron, layer_2 1 hinh tron
        System.out.println("So phan tu cua layer_0 la " + layer_0.getArr_Shape_size());
        System.out.println("So phan tu cua layer_2 la " + layer_2.getArr_Shape_size());
        System.out.println("Xoa tat ca cac hinh tron trong diagram...");
        diagram.removeAllCircles();
        System.out.println("Sau khi xoa:");
        System.out.println("\tSo phan tu cua layer_0 la " + layer_0.getArr_Shape_size());
        System.out.println("\tSo phan tu cua layer_2 la " + layer_2.getArr_Shape_size());
        
        
        
    }
    
}

// class de luu lai toa do
class Position {
    private double x;
    private double y;

    public Position() {
        x = 0;
        y = 0;
    }

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}

abstract class Shape {
    public abstract boolean isFilled();
    public abstract boolean canBeMoved();
}

class Circle extends Shape {
    private double radius; // ban kinh
    private Position position;
    public static final double PI = 3.1415;
    // constructor kieu sau la khong hop le
    /*
    public Circle(double radius, double I_x, double I_y) {
        this.radius = radius;
        this.position.setX(I_x);
        this.position.setY(I_y);
    }
    
    public Circle(double radius) {
        this.radius = radius;
        this.position.setX(0);
        this.position.setY(0);
    }
     */
    
    // constructor hop le
    public Circle(double radius, Position position) {
        this.radius = radius;
        this.position = position;
    }
    
    public Circle() {
    }
    
    // ghi de cac phuong thuc o abstract class
    @Override
    public boolean isFilled() {
        return false;
    }

    @Override
    public boolean canBeMoved() {
        return true;
    }
    
    // getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(double x, double y) {
        this.position.setX(x);
        this.position.setY(y);
    }
    
    // tinh dien tich
    public double getArea() {
        return PI*radius*radius;
    }
    
    // tinh chu vi
    public double getPerimeter() {
        return 2*PI*radius;
    }
    
    // in ra thong tin
    public void printInfo() {
        boolean canBeMoved = this.canBeMoved();
        System.out.println("Hinh tron co tam (" + position.getX() + ", " + position.getY() + ")");
        System.out.println("Ban kinh hinh tron: " + radius);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Dien tich: " + getArea());
        if (isFilled()) {
            System.out.println("Hinh tron nay duoc to mau");
        }
        else System.out.println("Hinh tron nay duoc to mau");
        if (canBeMoved()) {
            System.out.println("Hinh tron nay co the di chuyen");
        }
        else System.out.println("Hinh tron nay khong the di chuyen");
    }
}

class Rectangle extends Shape {
    protected Position vertex1;
    protected Position vertex2;
    protected Position vertex3;
    protected Position vertex4;

    // constructor
    public Rectangle(Position vertex1, Position vertex2, Position vertex3, Position vertex4) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
        this.vertex4 = vertex4;
    }

    public Rectangle() {
    }
   
    // ghi de cac phuong thuc cua class Shape
    @Override
    public boolean isFilled() {
        return true;
    }

    @Override
    public boolean canBeMoved() {
        return true;
    }
    
    // getter va setter cac dinh
    public Position getVertex1() {
        return vertex1;
    }

    public void setVertex1(double x, double y) {
        this.vertex1.setX(x);
        this.vertex1.setY(y);
    }

    public Position getVertex2() {
        return vertex2;
    }

    public void setVertex2(double x, double y) {
        this.vertex2.setX(x);
        this.vertex2.setY(y);
    }

    public Position getVertex3() {
        return vertex3;
    }

    public void setVertex3(double x, double y) {
        this.vertex3.setX(x);
        this.vertex3.setY(y);
    }

    public Position getVertex4() {
        return vertex4;
    }

    public void setVertex4(double x, double y) {
        this.vertex4.setX(x);
        this.vertex4.setY(y);
    }

    //lay ra chieu dai va chieu rong
    public double getLength() {
        double difX = vertex2.getX() - vertex1.getX();
        double difY = vertex2.getY() - vertex1.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getWidth() {
        double difX = vertex3.getX() - vertex2.getX();
        double difY = vertex3.getY() - vertex2.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    // tinh dien tich hinh chu nhat
    public double getArea() {
        return getLength()*getWidth();
    }
    
    // tinh chu vi hinh chu nhat
    public double getPerimeter() {
        return 2*(getLength() + getWidth());
    }
    
}

class Square extends Rectangle {
    // constructor
    public Square(Position vertex1, Position vertex2, Position vertex3, Position vertex4) {
        super(vertex1, vertex2, vertex3, vertex4);
    }
    
    public Square() {
    }
    
    // Override cac phuong thuc cua class Shape
    @Override
    public boolean isFilled() {
        return false;
    }

    @Override
    public boolean canBeMoved() {
        return true;
    }
}

class Triangle extends Shape {
    private Position vertex1;
    private Position vertex2;
    private Position vertex3;
    
    // constructor
    public Triangle() {
    }

    public Triangle(Position vertex1, Position vertex2, Position vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }
    
    // setter
    public void setVertex1(double x, double y) {
        this.vertex1.setX(x);
        this.vertex1.setY(y);
    }
    
    public void setVertex2(double x, double y) {
        this.vertex2.setX(x);
        this.vertex2.setY(y);
    }
    
    public void setVertex3(double x, double y) {
        this.vertex3.setX(x);
        this.vertex3.setY(y);
    }
    
    //getter
    public Position getVertex1() {
        return vertex1;
    }

    public Position getVertex2() {
        return vertex2;
    }

    public Position getVertex3() {
        return vertex3;
    }
    
    // Override cac phuong thuc cua class Shape
    @Override
    public boolean isFilled() {
        return true;
    }

    @Override
    public boolean canBeMoved() {
        return true;
    }
    
    // lay ra do dai 3 canh
    public double getE1() {
        double difX = vertex2.getX() - vertex1.getX();
        double difY = vertex2.getY() - vertex1.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE2() {
        double difX = vertex3.getX() - vertex2.getX();
        double difY = vertex3.getY() - vertex2.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE3() {
        double difX = vertex1.getX() - vertex3.getX();
        double difY = vertex1.getY() - vertex3.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    // tinh chu vi
    public double getPerimeter() {
        return getE1() + getE2() + getE3();
    }
    
    // tinh dien tich
    public double getArea() {
        // Heron's Formula
        double p = getPerimeter()/2;
        return Math.sqrt( p*(p - getE1())*(p - getE2())*(p - getE3()) );
    }
}
