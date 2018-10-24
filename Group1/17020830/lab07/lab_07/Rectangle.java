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
public class Rectangle extends Shape{
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    public Rectangle(){
        
    }
    
    public boolean compare_rectangle(Rectangle re){
        if((this.getLength() == re.getLength()) && (this.getWidth() == re.getWidth()))
            return true;
        return false;
    }
    public void setRectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(String color,double x, double y, double length, double width) {
        super(color,x,y);
        this.length = length;
        this.width = width;
    }
    
    public double getPiremeter(){
        return (this.length + this.width)*2;
    }
    public double getArea(){
        return (this.length * this.width);
    
    }
    @Override
    public void del(){
        System.out.print("sadsad");
        
    }
}
