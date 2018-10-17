import java.util.Scanner;

public class Rectangle extends Shape
{

    private Double width = 1.0;

    private Double length = 1.0;

    public Rectangle()
    {
    }

    @Override
    public String toString()
    {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color='" + color + '\'' + ", posiX=" + posiX + ", posiY=" + posiY + '}';
    }

    @Override
    public void inputInfo()
    {
        super.inputInfo();
        System.out.println("input width: ");
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        System.out.println("input heigh: ");
        length = sc.nextDouble();
    }

    public Rectangle(Double width, Double length)
    {
        this.width = width;
        this.length = length;
    }

    @Override
    public Double getArea()
    {
        return this.width * this.length;
    }

    @Override
    public Double getPerimeter()
    {
        return (this.width + this.length) * 2;
    }

    public Double getWidth()
    {
        return width;
    }

    public void setWidth(Double width)
    {
        this.width = width;
    }

    public Double getLength()
    {
        return length;
    }

    public void setLength(Double length)
    {
        this.length = length;
    }

}
