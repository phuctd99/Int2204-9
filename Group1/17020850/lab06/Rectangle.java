package lab06;

//import java.util.Scanner;

public class Rectangle extends Shape {
    protected int length, width;

    public Rectangle() {
    }
    
    public Rectangle(int length,int width,boolean  canMove, boolean  color)
    {
        this.canMove= canMove;
        this.color=color;
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public void input() {
        System.out.println("thong tin cua hinh chu nhat");
        super.input();
        System.out.println("Chieu dai la: ");
        setLength(super.scan.nextInt());
        System.out.println("Chieu rong la: ");
        setWidth(super.scan.nextInt());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Chieu rong cua hinh chu nhat: " + getWidth());
        System.out.println("Chieu dai: cua hinh chu nhat" + getLength());
    }

}