/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Nguyễn Quang Hiệp
 * class test
 */
public class TestDriver {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "red", false);
        Rectangle rectangle = new Rectangle();
        Shape shape = new Shape();
        Square square = new Square(5, "blue", false);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(shape.toString());
        System.out.println(square.toString());    
    }
}
