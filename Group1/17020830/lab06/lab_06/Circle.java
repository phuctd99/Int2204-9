
package lab_06;

public class Circle extends Shape{
    protected double radius;
    protected final double PI = 3.14;
    
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color,double x, double y,double radius) {
        super(color,x,y);
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2*PI*this.radius;
    }
    
    public double getArea(){
        return PI*Math.pow(this.radius, 2.0);
    }
    @Override
    public void del(){
        System.out.print("hello");
    }
    
}
