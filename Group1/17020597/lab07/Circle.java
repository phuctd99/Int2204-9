/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OppLab7;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    private int radius;
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public Circle(String color, boolean filled, ToaDo td, int radius) {
        super(color, filled, td);
        this.radius = radius;
    }
    @Override
    public void drawing() {
        repaint();
    }
    @Override
    public void paintComponent(Graphics g ) {
        super.paintComponent(g);
        g.setColor(Color.getColor(getColor()));
        g.fillOval(getToaDo().getX0(), getToaDo().getY0(), radius, radius);
    }
}
