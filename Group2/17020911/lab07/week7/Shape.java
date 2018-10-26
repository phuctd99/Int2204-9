/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author Admin
 */
public class Shape {

    private String color;
    private boolean filled;
    private boolean visible;

    public Shape() {
        color = "red";
        filled = true;
    }

    public String getColor() {
        return color;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Shape(String color, boolean filled, boolean visible) {
        this.color = color;
        this.filled = filled;
        this.visible = visible;
    }

    public void setColor(String a) {
        color = a;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean a) {
        filled = a;
    }

    @Override
    public String toString() {
        return "shape{" + "color=" + color + ", filled=" + filled + '}';
    }
}
