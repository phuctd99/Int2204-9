public class Circle extends Shape{
    public static String name = "circle";
    private double radius;

    //Constructor
    public Circle(String color, double radius, double x, double y) {
        super(color, x, y);
        this.radius = radius;
    }

    //Ham tinh chu vi
    public double getPerimeter(){
        return 2*3.14*radius;
    }

    //getter, setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return name +" color: "+color+", Central = ("+x+","+y+") "+"radius = "+radius+"\n";
    }

    @Override
    public boolean equals(Shape shape){
        if (shape instanceof Circle)
            return (x == shape.getX()) && (y == shape.getY()) && (radius == ((Circle) shape).getRadius());
        return false;
    }

    @Override
    public boolean isSameType(Shape shape){
        return shape instanceof Circle;
    }
}
