/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Tommmm^^
 */
public class Rectange extends Shape {
    double width;
    double length;
     public Rectange(){
        width = 1.0;
        length = 1.0;
    }
     public Rectange(double width, double length){
        this.width = width;
        this.length = length;
    }
     public Rectange(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        
        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
     
    
}
