/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5;

/**
 *
 * @author CCNE
 */
public class Tuan5 {
    public static void main(String []args){
		Shape shape =new Shape();
		System.out.println("-----------------");
		System.out.println("Shape");
		System.out.println(shape.toString());
		//
		System.out.println("-----------------");
		System.out.println("Shape");
		Circle circle = new Circle(3);
		System.out.println(circle.toString());
		//
		System.out.println("-----------------");
		System.out.println("Shape");
		Rectangle rectangle = new Rectangle(4, 5, "blue", true);
		System.out.println(rectangle.toString());
		//
		System.out.println("-----------------");
		System.out.println("Shape");
		Square square = new Square(6);
		System.out.println(square.toString());
	}
    
}
