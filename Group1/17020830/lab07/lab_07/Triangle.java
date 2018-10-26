/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

/**
 *
 * @author admin
 */
public class Triangle extends Shape{
    protected double x1;
    protected double y1;
    protected double x2;
    protected double y2;
    
    public Triangle(){
        
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    public Triangle(double x1, double y1, double x2, double  y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Triangle(String color,double x, double y, double x1, double y1, double x2, double y2) {
        super(color,x,y);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public boolean compare_triangle(Triangle tr){
        if(this.getX1() == tr.getX1() && this.getY1() == tr.getY1() && this.getX2() == tr.getX2() && this.getY2() == tr.getY2())
            return true;
        return false;
    }
    @Override
    public void del(){
        System.out.print("sadsad");
        
    }
}
