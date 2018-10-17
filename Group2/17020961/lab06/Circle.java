/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author CCNE
 */
public class Circle extends Shape {
    private ToaDo tam;
    private int radius;
    private final double PI = 3.14;

    public  Circle() {}

    public Circle(ToaDo center, int radius) {
        super();
        this.tam = center;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, ToaDo tam, int radius) {
        super(color, filled);
        this.tam = tam;
        this.radius = radius;
    }

    public ToaDo getCenter() {
        return tam;
    }

    public void setCenter(ToaDo tam) {
        this.tam= tam;
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
        tam.setX(this.tam.getX() + x);
        tam.setY(this.tam.getY() + y);
    }
    
}
