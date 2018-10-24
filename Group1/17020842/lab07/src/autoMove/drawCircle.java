/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoMove;

/**
 *
 * @author CACLV
 */
import Shapes.Circle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
import location.Location2D;

/**
 *
 * @author CACLV
 */
public class drawCircle extends JPanel implements ActionListener {

    Timer t = new Timer(5, this);
    int x = 0, y = 0, velX = 5, velY = 5;
    public Circle cir = new Circle(40, new Location2D(0, 0), Color.red, true);

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(cir.getColor());
        Ellipse2D circle = new Ellipse2D.Double(cir.getCenterD().getX(), cir.getCenterD().getY(), 40, 40);
        g2d.fill(circle);
        Ellipse2D circle1 = new Ellipse2D.Double(cir.getCenterD().getX() + 80, cir.getCenterD().getY(), 80, 80);
        g2d.fill(circle1);
        t.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (cir.getCenterD().getX() < 0 || cir.getCenterD().getX() > 600 - cir.getRadius() * 2) {
            velX = -velX;
        }
        if (cir.getCenterD().getY() < 0 || cir.getCenterD().getY() > 400 - cir.getRadius() * 2) {
            velY = -velY;
        }
        cir.getCenterD().setX(cir.getCenterD().getX() + velX);
        cir.getCenterD().setY(cir.getCenterD().getY() + velY);
        repaint();
    }

}
