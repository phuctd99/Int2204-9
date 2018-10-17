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
public class Rectangle extends Shape {

    double width;
    double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // Constructor
    public Rectangle(double width, double height, String colorString, boolean filled) {
        super(colorString, filled);
        this.width = width;
        this.height = height;
    }
    // Return info
    @Override
    public String getInfo() {
        return "Rectangle => Width: " + width + " Height: " + height + " Color: " + colorString + " Filled: " + filled;
    }

}
