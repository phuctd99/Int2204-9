/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap06;

/**
 *
 * @author Hoang Vu Huong
 */
public class Circle extends Shape{
    private double radius;
    public Circle(int _x, int _y, String _color, double _r) {
        super(_x, _y, _color);
        radius = _r;
    }
    @Override
    public void draw(){
        System.out.println("Draw Circle");
    }
    
    @Override
    public void erase(){
        System.out.println("Erase Circle");   
    }

    @Override
    public void output() {
        System.out.println("------Circle-------");
        super.output();
        System.out.println("Bán kính: " + radius);
        System.out.println();
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }    
    
    
}
