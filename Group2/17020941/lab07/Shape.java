package oop_tuan6;

import java.util.Arrays;

abstract public class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape() {
        this.x = 0;
        this.y = 0;
        this.color = "black";
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void fillColor(String color) {
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean equals(Shape b) {
    	int[] arrX1 = this.getXT();
		int[] arrY1 = this.getYT();
		int[] arrX2 = b.getXT();
		int[] arrY2 = b.getYT();
		if (this.getLength() == b.getLength()
			&& this.getRadius() == b.getRadius() 
			&& this.getWidth() == b.getWidth()
			&& this.getX() == b.getX()
			&& this.getY() == b.getY() 
			&& Arrays.equals(arrX1, arrX2) && Arrays.equals(arrY1, arrY2))
    	return true;
    	else 
    		return false;
    }
    abstract int getWidth();
    abstract int getLength();
    abstract int[] getYT();
    abstract int[] getXT();
    abstract int getRadius();
    abstract boolean getIsSquare();
    abstract public int[] getxHex();
    abstract public int[] getyHex();
    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}