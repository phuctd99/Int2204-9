package DoThi;

public class Circle extends Shape{//ke thua lop Shape
    private double radius;
    final double PI = 3.14;
    private double area, perimeter;

    Circle(){
        this.radius = 1.0;
        this.perimeter = 0;
        this.area = 0;
    }

    Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //ham tinh dien tich
    public double tinhArea(double radius, double PI){
        return PI*radius*radius;
    }

    //ham tinh chu vi
    public double tinhPerimeter(double radius, double PI){
        return 2*PI*radius;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color = " + getColor() +
                ", filled = " + isFilled() +
                ", radius=" + radius +
                ", PI=" + PI +
                ", area=" + tinhArea(radius, PI) +
                ", perimeter=" + tinhPerimeter(radius, PI) +
                '}';
    }

//    public void Calculated(Circle cal){
//        System.out.println("Dien tich: " + cal.tinhArea(radius, PI));
//        System.out.println("Chu vi: " + cal.tinhPerimeter(radius, PI));
//    }
}
