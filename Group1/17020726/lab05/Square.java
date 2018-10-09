public class Square extends Rectangle
{
    public Square()
    {
    }

    public Square(double side)
    {
        this.setWidth(side);
        this.setLength(side);
    }

    Square(double side, String color, boolean filled)
    {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setWidth(double width)
    {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length)
    {
        super.setLength(length);
    }

}
