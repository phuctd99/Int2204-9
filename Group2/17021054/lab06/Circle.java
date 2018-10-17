import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Circle extends Shape{
    private double radius;
    private double pi = Math.PI;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void nhap(){
        System.out.println("nhap r");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        this.setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }

    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return pi*radius*radius;
    }
    public double getPerimeter(){
        return 2*pi*radius;
    }

    public void InToado() {
        System.out.println( "Circle{" + "radius= " + radius + ", pi=" + pi + '}' + "\n");

    }
}