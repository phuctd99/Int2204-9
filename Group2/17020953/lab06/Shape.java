/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "Red";
        this.filled = true;
    }

    public Shape(String colors, boolean filled) {
        this.color = colors;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public boolean getFiller() {
        return this.filled;
    }

    public void setFiller(boolean f) {
        this.filled = f;
    }

    public String toString() {
        return "| Màu sắc: " + this.color + " | Filled: " + this.filled;
    }
}
