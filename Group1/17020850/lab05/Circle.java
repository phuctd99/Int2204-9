
public class Circle extends Shape{
    private double radius = 1.0;
    private final double PI = 3.14;
    Circle (double radius)
    {
        this.radius = radius;
        
    }
    Circle (double radius,String color, boolean filled)
    {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea ()
    {
        return(PI * radius * radius);
    }
    public double getPerimeter()
    {
        return (2*PI*radius);
    }
    public String toString()
    {
        
        return super.toString()+"\n"+this.getArea() +"\n" + this.getPerimeter();
        //return this.getArea() +"\n" + this.getPerimeter();
    }
    public static void main(String[] args) {
        Circle C= new Circle(1.0,"red",true);
        //System.out.println(C.getPerimeter());
        //System.out.println(C.getArea());
        System.out.println(C.toString());
    }
    
}
