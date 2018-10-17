import java.util.Scanner;

public abstract class Shape
{

    protected String color = "blue";

    protected double posiX;
    protected double posiY;

    public Shape()
    {
    }

    public void inputInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("input color: ");
        this.color = sc.nextLine();
        System.out.print("input X position: ");
        this.posiX = sc.nextDouble();
        System.out.print("input Y position: ");
        this.posiY = sc.nextDouble();
    }

    public abstract Double getArea();

    public abstract Double getPerimeter();

    @Override
    public String toString()
    {
        return "Shape{" + "color='" + color + '\'' + ", posiX=" + posiX + ", posiY=" + posiY + '}';
    }
}
