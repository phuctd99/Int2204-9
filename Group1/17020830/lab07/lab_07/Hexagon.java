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
public class Hexagon extends Shape{
    protected double x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;

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

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public double getX5() {
        return x5;
    }

    public void setX5(double x5) {
        this.x5 = x5;
    }

    public double getY5() {
        return y5;
    }

    public void setY5(double y5) {
        this.y5 = y5;
    }
    public Hexagon(){
        
    }
    public Hexagon(String color,double x, double y,double radius,double x1, double y1, double x2, double y2, 
                        double x3, double y3, double x4, double y4, double x5, double y5){
        super(color, x, y);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.y3 = y3;
        this.y4 = y4;
        this.y5 = y5;
        
    }
    
    public boolean compare_Hexagon(Hexagon he){
        if(this.x1 == he.x1 && this.x2 == he.x2 && this.x3 == he.x3 && this.x5 == he.x5 && this.x4 == he.x4 && 
                this.y1 == he.y1 && this.y2 == he.y2 && this.y3 == he.y3 && this.y4 == he.y4 &&this.y5 == he.y5)
            return true;
        return false;
    }
           
    
    public void del(){
        System.out.println("DSADASD");
    }
}
