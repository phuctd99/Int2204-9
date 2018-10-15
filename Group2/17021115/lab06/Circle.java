/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;
public class Circle extends Shape {
    private ToaDo toaDoTam;
    private int radius = 1;
    private final double PI = 3.14;

    public  Circle() {}

    public Circle(ToaDo toaDoTam, int radius) {
        super();
        this.toaDoTam = toaDoTam;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, ToaDo toaDoTam, int radius) {
        super(color, filled);
        this.toaDoTam = toaDoTam;
        this.radius = radius;
    }

    public ToaDo getCenter() {
        return toaDoTam;
    }

    public void setCenter(ToaDo toaDoTam) {
        this.toaDoTam = toaDoTam;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public void move(int x, int y) {
        toaDoTam.setX(this.toaDoTam.getX() + x);
        toaDoTam.setY(this.toaDoTam.getY() + y);
    }
}