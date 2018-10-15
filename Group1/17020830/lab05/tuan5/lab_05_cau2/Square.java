/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05_cau2;

/**
 *
 * @author admin
 */
    public class Square extends Rectangle{

    public Square() {
        
    }
    public Square(double size){
        super.setLength(size);
        super.setWidth(size);
    }
    public Square(double size,String color, boolean filled){
        this.width = size;
        this.length = size;
        this.color = color;
        this.filled = filled;
    }
    public void setSize(double size){
        super.setLength(size);
        super.setWidth(size);
    }
    public double getSize(){
        return super.getLength();
    }
    
    public String toString(){
        return super.toString()+" Square";
    }
}
