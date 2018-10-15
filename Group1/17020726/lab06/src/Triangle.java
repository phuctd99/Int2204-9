public class Triangle extends Shape
{

    private double c1, c2, c3;

    public Triangle()
    {
    }

    public Triangle(double c1, double c2, double c3)
    {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }


    @Override
    public Double getArea()
    {
        return null;
    }

    @Override
    public Double getPerimeter()
    {
        return (this.c1 + this.c2 + this.c3);
    }

    @Override
    public String toString()
    {
        return "Triangle{" + "c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + '}';
    }

}
