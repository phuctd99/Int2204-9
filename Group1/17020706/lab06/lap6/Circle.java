/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author DELL
 */
public class Circle extends Shape {

    final double PI = 3.14;
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    // Constructor
    public Circle(int radius, String colorString, boolean filled) {
        super(colorString, filled);
        this.radius = radius;
    }
    // Return info
    @Override
    public String getInfo() {
        return "Circle => Radius: " + radius + " Color: " + colorString + " Filled: " + filled;
    }

}
