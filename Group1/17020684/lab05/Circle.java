
package lab5_1;

public class Circle extends Shape {
    protected double radius = 1.0;
    //Constructor
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    //getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //chu vi
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    //dientich
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    //toString
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
}