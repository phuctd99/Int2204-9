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
public class Triangle extends Shape{
    protected  int a, b, c;
    protected Point2D point1;
    protected Point2D point2;
    protected Point2D point3;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public Point2D getPoint3() {
        return point3;
    }

    public void setPoint3(Point2D point3) {
        this.point3 = point3;
    }

    
    
    @Override
    public boolean Duplicate(Shape p) {
        if(this instanceof Triangle && p instanceof Triangle){
            Triangle a = (Triangle) p;
            return this.point1.Duplicated(a.point1)
                   && this.point2.Duplicated(a.point2)
                   && this.point3.Duplicated(a.point3);
        }
        return false;
    }

        
}
