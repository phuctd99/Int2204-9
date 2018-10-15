import java.util.Scanner;

public class Square extends Shape
{

    private double size;

    public Square()
    {
    }

    @Override
    public String toString()
    {
        return "Square{" + "size=" + size + ", color='" + color + '\'' + ", posiX=" + posiX + ", posiY=" + posiY + '}';
    }

    @Override
    public void inputInfo()
    {
        super.inputInfo();
        System.out.println("input size: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextDouble();
    }

    public Square(double size)
    {
        this.size = size;
    }


    @Override
    public Double getArea()
    {
        return Math.pow(size, 2);
    }

    @Override
    public Double getPerimeter()
    {
        return size * 4;
    }

}
