package bai2;

import java.util.Scanner;

public class Circle extends Shape {
    public final double PI = 3.14;

    protected double radius = 1.0;

    //Ham khoi tao lop Circle

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //Ham tinh dien tich

    public double getArea(){
        return PI * this.radius * this.radius;
    }

    //Ham tinh chu vi

    public double getPerimeter(){
        return PI * 2 * radius;
    }

    //Ham ghi de toString

    public String toString(){
        return radius + " " + super.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("In Dien tich : " + c.getArea());
        System.out.println("In Chu vi : " + c.getPerimeter());
        System.out.println("In ghi de : " + c.toString());
    }
}
