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
public class Square extends Rectangle{
    private int wide;
    public Square(int wide, String color, boolean filled, ToaDo td) {
        super(wide, wide, color, filled, td);
    }
    @Override
    public void paintComponent(Graphics g ) {
        super.paintComponent(g);
        g.setColor(Color.getColor(getColor()));
        g.fillRect(getToaDo().getX0(), getToaDo().getY0(), wide, wide);
    }
    
}
