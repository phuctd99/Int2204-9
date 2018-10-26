/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttuan7;

import java.awt.Graphics;

/**
 *
 * @author Nguyen
 */
public class paint {
    public void paintTriangle (Graphics g, Triangle tri)
    {
        g. drawRect(tri.getP1().getX(), tri.getP1().getY(),tri.getP2().getX(),tri.getP2().getY());
        g. drawRect(tri.getP2().getX(), tri.getP2().getY(),tri.getP3().getX(),tri.getP3().getY());
        g. drawRect(tri.getP3().getX(), tri.getP3().getY(),tri.getP1().getX(),tri.getP1().getY());
    }
    
    public void paintRectangle (Graphics g, Rectangle rec ) {
        g.drawLine(rec.getTop_left().getX(), rec.getTop_left().getY(), rec.getTop_right().getX(), rec.getTop_right().getY());
        g.drawLine(rec.getTop_right().getX(), rec.getTop_right().getY(), rec.getBot_right().getX(), rec.getBot_right().getY());
        g.drawLine(rec.getBot_right().getX(), rec.getBot_right().getY(), rec.getBot_left().getX(), rec.getBot_left().getY());
        g.drawLine(rec.getBot_left().getX(), rec.getBot_left().getY(), rec.getTop_left().getX(), rec.getTop_left().getY());
    }
    
    public void paintSquare (Graphics g, Square squ) {
        g.drawLine(squ.getTop_left().getX(), squ.getTop_left().getY(), squ.getTop_right().getX(), squ.getTop_right().getY());
        g.drawLine(squ.getTop_right().getX(), squ.getTop_right().getY(), squ.getBot_right().getX(), squ.getBot_right().getY());
        g.drawLine(squ.getBot_right().getX(), squ.getBot_right().getY(), squ.getBot_left().getX(), squ.getBot_left().getY());
        g.drawLine(squ.getBot_left().getX(), squ.getBot_left().getY(), squ.getTop_left().getX(), squ.getTop_left().getY());
    }
    
    public void paintCirde (Graphics cir) {
        
    }

}
