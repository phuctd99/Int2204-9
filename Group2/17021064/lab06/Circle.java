public class Circle extends Shape{
    private double radius ;
    private Location center;
    private final double PI = 3.14159 ;
    public Circle(){
        this.radius = 1.0;
        this.center = new Location(0, 0);
    }
    public Circle(double radius, Location center){
        this.radius = radius ;
        this.center = center;
    }
    public Circle(double radius , Location center, String c , boolean f){
        super(c, f) ;
        this.radius = radius ;
        this.center = center;
    }
    public double getRadius(){
        return radius ;
    }
    public void setRadius(double radius){
        this.radius = radius ;
    }
    public double getArea(){
        return PI*(this.radius * this.radius) ;
    }
    public double getPerimeter(){
        return 2*PI*radius ;
    }
    @Override
    public String toString(){
        return "Diện tích: " + this.getArea() + " | Chu vi: " + this.getPerimeter() + " | " + super.toString() + " | Bán kính: " + this.radius;
    }
}