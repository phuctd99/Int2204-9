public class Circle extends Shape{
    private double radius ;
    private final double PI = 3.14159 ;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double r){
        this.radius = r ;
    }
    public Circle(double r , String c , boolean f){
        super(c, f) ;
        this.radius = r ;

    }
    public double getRadius(){
        return radius ;
    }
    public void setRadius(double r){
        this.radius = r ;
    }
    public double getArea(){
        return PI*(this.radius * this.radius) ;
    }
    public double getPerimeter(){
        return 2*PI*radius ;
    }
    @Override
    public String toString(){
        return "Diện tích: " + this.getArea()+ " | chu vi: " + this.getPerimeter() + " " + super.toString()+ " | bán kính: "+ radius;
    }
}
