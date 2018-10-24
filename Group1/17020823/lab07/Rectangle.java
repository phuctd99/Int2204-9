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
public class Rectangle extends Shape{
    protected int width, heigth;
    protected Point2D Pointcenter;

    

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public Point2D getPointcenter() {
        return Pointcenter;
    }

    public void setPointcenter(Point2D Pointcenter) {
        this.Pointcenter = Pointcenter;
    }
    
    @Override
    public boolean Duplicate(Shape p) {
        if(this instanceof Rectangle && p instanceof Rectangle){
            Rectangle a = (Rectangle) p;
            return this.width == a.width && this.heigth == a.heigth && this.Pointcenter.Duplicated(a.Pointcenter);
        }
        return false;
    }
  
}
