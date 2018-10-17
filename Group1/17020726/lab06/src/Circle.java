import java.util.Scanner;

public class Circle extends Shape
{

    static final double PI = 3.14;

    private Double radius = 1.0;

    public Circle()
    {
    }

    @Override
    public String toString()
    {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + ", posiX=" + posiX + ", posiY=" + posiY + '}';
    }

    @Override
    public void inputInfo()
    {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("input radius: ");
        radius = sc.nextDouble();
    }

    public Circle(Double radius)
    {
        this.radius = radius;
    }


    public Double getRadius()
    {
        return radius;
    }

    public void setRadius(Double radius)
    {
        this.radius = radius;
    }

    public Double getArea()
    {
        return Math.pow(this.radius, 2) * PI;
    }

    public Double getPerimeter()
    {
        return this.radius * 2 * PI;
    }

}
