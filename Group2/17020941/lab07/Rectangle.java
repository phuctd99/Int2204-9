package oop_tuan6;


public class Rectangle extends Shape {

    protected int width;
    protected int length;

    public Rectangle() {
        super();
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int width, int length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(int x, int y, String color, int width, int length) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public boolean getIsSquare(){return false;}
    public void setLength(int length) {
        this.length = length;
    }
    public int[] getYT(){ int[] arr = null; return arr;}
    public int[] getXT(){int[] arr = null; return arr;}
    public int getRadius() {return 0;}
    public int[] getxHex() 	{int[] arr = null; return arr;}
    public int[] getyHex() 	{int[] arr = null; return arr;}
    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", length=" + length +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}