/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap07;

/**
 *
 * @author ADMIN
 */
public class Triangle extends Shape{
    private double a, b, c;
    
    public Triangle(){
        super();
    }

    public Triangle(int x, int y, boolean isMove, boolean isColor, double a, double b, double c) {
        super(x, y, isMove, isColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
   public double getArea () {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
}
