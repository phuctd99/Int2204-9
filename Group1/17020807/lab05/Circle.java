/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Admin
 */
public class Circle extends Shape {
	
    final private double PI = 3.14;
    private double radius = 1.0;
	
    public Circle() {
        super("", true);
        this.radius = 1.0;
    }
	
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }
	
    public void setRadius(double radius) {
		this.radius = radius; 
		}
		
    public double getRadius() {
		return this.radius; 
		}
		
    public double getArea() {
        return (this.radius*this.radius)*this.PI;
    }
    public double Perimeter() {
        return (this.radius * 2 * this.PI);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "black", false);
        System.out.println("The area is: "+ circle.getArea() 
                + "\n The perimeter is: " + circle.Perimeter());
        System.out.println(circle.toString());
    }
    
}
