/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.lab6;

/**
 *
 * @author Admin
 */
public class Circle extends Shape {
    final private double PI = 3.14;
    private double radius = 1.0;
    private ToaDo Tam;
    public Circle() {
        super("", true);
        this.radius = 1.0;
        this.Tam.setX0(2);
        this.Tam.setY0(4);
    }
    public Circle(double radius, String color, boolean filled, ToaDo Tam) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
        this.Tam = Tam;
    }
    public void setRadius(double radius) {this.radius = radius; }
    public double getRadius() {return this.radius; }

    public void setTam(ToaDo Tam) {
        this.Tam = Tam;
    }

    public ToaDo getTam() {
        return Tam;
    }
    
    @Override
    public String getNameShape() {
        return "Hình tròn";
    }
    
}
