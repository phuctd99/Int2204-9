package bai2;

import java.util.Scanner;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    //Ham khoi tao lop Rectangle

    public Rectangle(String color, boolean filled){
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }

    public String toString(){
        return width + " " + length + " " + super.toString();
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle R = new Rectangle();
        System.out.println("In Dien tich : " + R.getArea());
        System.out.println("In Chu vi : " + R.getPerimeter());
        System.out.println("In ghi de : " + R.toString());
    }

}
