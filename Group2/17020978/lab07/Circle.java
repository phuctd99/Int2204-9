import java.awt.*;

public class Circle extends Shape {
    double radius = 1.0;

    public final double PI = 3.14;



    Circle(){}
    public Circle(int x, int y,double radius, String color, boolean filled)
    {
        super(x,y,color, filled);
        this.radius = radius;
    }

//    public Circle (int y, int z)
//    {
//        this.y = y;
//        this.z = z;
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled +" Ban kinh hinh tron:" + this.radius ;
    }

}
