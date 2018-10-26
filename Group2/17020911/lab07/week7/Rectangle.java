/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape //class rectangle
{

    private int width;
    private int length;
    private int x;
    private int y;

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(int width, int length, int x, int y) {
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public Rectangle(int width, int length, int x, int y, String color, boolean filled, boolean visible) {
        super(color, filled, visible);
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

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

    

    

    public void draw(Graphics g)
    {
        g.fillRect(x, y, width, length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

}