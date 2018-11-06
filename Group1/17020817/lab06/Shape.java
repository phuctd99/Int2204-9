/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author hung
 */
public abstract class Shape {

    protected String color;

    protected double x;
    protected double y;

    public Shape() {
    }

    public abstract void NhapThongTIn();
    public abstract Double getArea();
    public abstract Double getPerimeter();

    @Override
    public String toString() {
        return " color " + color + ", x = " + x + ", y = " + y ;
    }
}