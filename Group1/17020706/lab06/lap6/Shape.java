/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author DELL
 */
public abstract class Shape {

    String colorString;
    boolean filled;

    public String getColorString() {
        return colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // Constructor
    public Shape(String colorString, boolean filled) {
        this.colorString = colorString;
        this.filled = filled;
    }
    // Return info
    public abstract String getInfo();
}
