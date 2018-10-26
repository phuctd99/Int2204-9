/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;
/**
 *
 * @author Hoang Vu Huong
 */
public class Circle extends Shape{
    protected int radius;
    private Point2D Pointcenter;

   

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point2D getPointcenter() {
        return Pointcenter;
    }

    public void setPointcenter(Point2D Pointcenter) {
        this.Pointcenter = Pointcenter;
    }
    
    @Override
    public boolean Duplicate(Shape p) {
        if(this instanceof Circle && p instanceof Circle){
            Circle a = (Circle) p;
            return this.radius== a.radius && this.Pointcenter.Duplicated(a.Pointcenter);
        }
        return false;
    }
}
