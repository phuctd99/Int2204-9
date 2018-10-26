/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OppLab7;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{
    protected int width;
    protected int height;
    public void setWidth(int width) {
        this.width = width;
        
    }
    @Override
    public int getWidth() { return width;}
    
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public int getHeight() {return height;}
    
    public Rectangle(int width, int height, String color, boolean filled, ToaDo td) {
        super(color, filled, td);
        this.width = width;
        this.height = height;
    }
    @Override
    public void drawing() {
        repaint();
    }
    @Override
    public void paintComponent(Graphics g ) {
        super.paintComponent(g);
        g.setColor(Color.getColor(getColor()));
        g.fillRect(getToaDo().getX0(), getToaDo().getY0(), width, height);
        
    }
}
