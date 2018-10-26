import java.awt.*;

public class Rectangle extends Shape {

    protected int width = 5;
    protected int length = 4;


    Rectangle(){}
   public Rectangle(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

   public Rectangle(int x, int y, int width, int length, String color, boolean filled)
    {
        super(x,y,color, filled);
        this.width = width;
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled+" Chieu dai hinh chu nhat:" + this.length + " Chieu rong hinh chu nhat:" + this.width ;
    }
}
