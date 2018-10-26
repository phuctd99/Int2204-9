
package lab_07;

public class Circle extends Shape{
    public double radius;
    protected final double PI = 3.14;
    
    public Circle(){
        
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void circle(Circle cr){
        this.color = cr.getColor();
        this.toado_x = cr.getToado_x();
        this.toado_y = cr.getToado_y();
        this.radius = cr.getRadius();
    }
    
    public boolean compare_circle(Circle cr){
        if( this.getRadius() == cr.getRadius())
            return true;
        return false;
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
