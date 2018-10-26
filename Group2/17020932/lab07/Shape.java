/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap07;

import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public abstract class Shape {
    protected int x, y;
    protected Color color;
    
    abstract public java.awt.Shape getShape();
    abstract public Object[][] getProperties();
    abstract public void setProperties(double[] properties);
    abstract public boolean isSameShape(Shape s);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
}
