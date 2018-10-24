import java.awt.*;

public class Shape {
    protected String color ;
    protected boolean filled = true;
    protected int x;
    protected int y;
    Shape(){}

    Shape(int x, int y, String color , boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.x = x;
        this.y = y;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString()
    {
        return (this.color + " " + this.filled);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
