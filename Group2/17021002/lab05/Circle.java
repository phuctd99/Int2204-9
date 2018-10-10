package lapo5;

public class Circle extends Shape{
	public double radius; 
    public final double PI = 3.141459265358979;
    public Circle (double radius) 
    {
    	this.radius = radius;
    }
    public Circle (String color , boolean filled,double radius)
    {   
    	super(color, filled);  
    	this.radius = radius;
    }
    public double getRadius () { return radius ;}
    public double getArea () { return PI * radius * radius ;}
    public double getPerimeter () { return 2 * PI * radius ;}
    public String toString() {
    	 return "Circle" + radius;
    }
    
}