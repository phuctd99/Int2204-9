/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Liscli
 */
public class Hexagon extends Shape{
    private int radius;
    private int centerX;
    private int centerY;

    public Hexagon() {
        this.radius = 1;
        this.centerX = 0;
        this.centerY = 0;
    }

    public Hexagon(int radius, int centerX, int centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Hexagon(int radius, int centerX, int centerY, String color, boolean filled) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.color = color;
        this.filled = filled;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hexagon other = (Hexagon) obj;
        if (this.radius != other.radius) {
            return false;
        }
        if (this.centerX != other.centerX) {
            return false;
        }
        if (this.centerY != other.centerY) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public void paint(Graphics g){
        Polygon polygon = new Polygon();
        for (int i = 0; i < 6; i++) {
            int xval = (int) (centerX + radius
                    * Math.cos(i * 2 * Math.PI / 6D));
            int yval = (int) (centerY + radius
                    * Math.sin(i * 2 * Math.PI / 6D));
            polygon.addPoint(xval, yval);
        }
        if(this.filled)g.fillPolygon(polygon);
        else g.drawPolygon(polygon);
    }
    @Override
    public String getColor(){
        return this.color;
    }
    //cài màu của hình
    @Override
    public void setColor(String color){
        this.color = color;
    }
    //trả về có đầy hay không 
    @Override
    public boolean isFilled(){
        return this.filled;
    }
    //cài trạng thái đày hay không đầy
    @Override
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    private String color;
    private boolean filled;
}
