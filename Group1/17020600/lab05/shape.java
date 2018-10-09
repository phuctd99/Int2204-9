/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan5_2;

/**
 *
 * @author CCNE
 */
public class shape {
    protected String color;
    protected boolean filled;

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
    public shape(){
        color = "red";
        filled = true;
    }
    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
}
