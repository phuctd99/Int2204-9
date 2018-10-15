public class Circle extends Shape{
    private double radius;
    private double pi = Math.PI;
    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;

    }
    public double getArea(){
        return pi*radius*radius;
    }
    public double getPerimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", pi=" + pi +
                ", color= " + getColor() +
                ", filled= " + isFilled()+
                '}';
    }
}
