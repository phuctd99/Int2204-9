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
public class Rectangle extends Shape {
	
    protected double width = 1.0;
    protected double length = 1.0;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
	
     public Rectangle() {
         super("", true);
         this.width = 1.0;
         this.length = 1.0;
     }
	 
     public Rectangle (double width,double length){
         this.width = width;
         this.length = length;
     }
	 
     public Rectangle (double width, double length, String color, boolean filled) {
         this.width  = width;
         this.length = length;
         this.setColor(color);
         this.setFilled(filled);
     }
	 
     public double getArea() {
         return (width * length);
     }
	 
     public double getPerimeter() {
         return (width + length) * 2;
     }
	 
     public static void main(String[] args) {
         Rectangle rt = new Rectangle(3.2, 0.5, "black", true);
         double area = rt.getArea();
         double perimeter = rt.getPerimeter();
         System.out.println("The area is: " + area + "\n The perimeter is: "+ perimeter);
         System.out.println(rt.toString());
     }
}
