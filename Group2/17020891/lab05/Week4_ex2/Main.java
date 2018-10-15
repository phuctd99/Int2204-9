package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape = new Shape("blue", true);
        Shape shape1 = new Shape();
        Circle circle = new Circle("green", true, 3.0);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.5);
        Retangle retangle = new Retangle("white", false, 4.0, 5.0);
        Retangle retangle1 = new Retangle();
        Retangle retangle2 = new Retangle(6.0, 5.5);
        Square square = new Square(5);
        square.setLength(6);
        System.out.println(shape);
        System.out.println(shape1);
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(retangle);
        System.out.println(retangle1);
        System.out.println(retangle2);
        System.out.println(circle.getArea());
        System.out.println(retangle.getPerimeter());
        System.out.println(square.getArea());
    }
}
