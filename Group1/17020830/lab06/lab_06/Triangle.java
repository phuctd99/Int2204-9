/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06;

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
    @Override
    public void del(){
        System.out.println("sadsad");
        
    }
}
