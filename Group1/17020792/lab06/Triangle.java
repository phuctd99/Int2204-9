/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author CCNE
 */
public class Triangle extends Shape{
    private double c1;
    private double c2;
    private double c3;
    
    public Triangle (double c1, double c2, double c3){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
       
    }
    
    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }
   public double getArea(){
       double p = (this.c1 + this.c2 + this.c3)/2;
       double re = p*(p-this.c1)*(p-this.c2)*(p-this.c3);
       re = Math.sqrt(2);
               return re;
            }
   
   public double getPerimeter(){
        return this.c1 + this.c2 + this.c3 ;
    }
   @Override
    public String toString(){
        return "Triangle : "+  this.getArea()+ " " + this.getPerimeter() + " " + color+" "+filled;  
    }
}
