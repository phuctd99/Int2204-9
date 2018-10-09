/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05.Shape;

/**
 *
 * @author admin
 */
public class Shape {
    protected String color;
    protected boolean filled ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Shape(){
        color = "red";
        filled = true;
        
    }
   
    
}
