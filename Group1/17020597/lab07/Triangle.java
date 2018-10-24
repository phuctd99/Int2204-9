/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OppLab7;

import java.awt.*;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    private final int c = 3;

    public Triangle(String color, boolean filled, ToaDo td) {
        super(color, filled, td);
    }
    @Override
    public void drawing() {
        repaint();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.getColor(getColor()));
        g.fillPolygon(new int[] {getToaDo().getX0(), getToaDo().getX0(), getToaDo().getX0()}, new int[] {getToaDo().getY0(), getToaDo().getY0(), getToaDo().getY0()}, c);
    }
}
