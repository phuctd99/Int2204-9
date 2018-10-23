package oop_tuan6;

public class Circle extends Shape {
    public final double PI = 3.14;
    private int radius;


    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} ";
    }
    public int[] getYT(){ int[] arr = null; return arr;}
    public int[] getXT(){int[] arr = null; return arr;}
    public boolean getIsSquare() {return false;}
    public int[] getxHex() 	{int[] arr = null; return arr;}
    public int[] getyHex() 	{int[] arr = null; return arr;}
	@Override
	int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
}