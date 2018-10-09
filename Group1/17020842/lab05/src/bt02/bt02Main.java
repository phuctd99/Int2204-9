/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author CACLV
 */
public class bt02Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "red", true);
        Rectangle rectangle = new Rectangle(2.0, 3.0, "green", true);
        Square square = new Square(5.0, "grey", true);
        System.out.println("Rectangle " + rectangle.toString());
        System.out.println(circle.toString());
        System.out.println("Square " + square.toString());
        
    }
}
