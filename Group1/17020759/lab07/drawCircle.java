package com.Draw;

import com.Shape.Circle;
import com.Shape.Location;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;

/**
 *
 * @author phixuanhoan
 */
public class drawCircle extends Circle {

    public drawCircle(Location l, int radius, Color color) {
        this.l = l;
        this.Radius = radius;
        this.color = color;
    }
    Component com;
    public Component draw() {
        int x = this.l.getX() - this.Radius;
        int y = this.l.getY() - this.Radius;
        int _radius = this.Radius;
        Color c = this.color;
        
        com = new Component() {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2d.setRenderingHints(rh);
                g2d.setColor(c);
                g2d.fillOval(0, 0, 2 * _radius, 2 * _radius);
            }
        };
        com.setSize(2 * _radius, 2 * _radius);
        com.setLocation(x, y);
        com.setName("cir");
        com.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePressCircle(evt);
            }

        });

        return com;
    }

    public void mousePressCircle(java.awt.event.MouseEvent evt) {
        Object[] options = {"Delete", "Move", "Change Color", "Change Radius"};
        int n = JOptionPane.showOptionDialog(null,
                "Select one action !",
                "Option ",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.DEFAULT_OPTION,
                null,
                options,
                options[0]);
        //Move
        switch (n) {
            case 1:
                String x = JOptionPane.showInputDialog(null, "Nhập x :");
                String y = JOptionPane.showInputDialog(null, "Nhập y :");
                if (x != null && y != null) {
                    this.l.setX(Integer.parseInt(x));
                    this.l.setY(Integer.parseInt(y));
                    com.setLocation(Integer.parseInt(x) - this.Radius, Integer.parseInt(y) - this.Radius);
                }
                // Delete
                break;
            case 0:
                com.getParent().getParent().setSize(900, 701);
                com.getParent().getParent().setSize(900, 700);
                com.getParent().remove(com);
                break;
            case 2:
                Object[] Objcolor = {"Red", "Blue", "Green", "Yealow", "Orange"};
                int color = JOptionPane.showOptionDialog(null,
                        "Select one color !",
                        "Change color",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.DEFAULT_OPTION,
                        null,
                        Objcolor,
                        Objcolor[0]);
                if (color == 0) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawCircle d1 = new drawCircle(this.l, this.Radius, Color.red);
                    com.getParent().add(d1.draw());
                }
                if (color == 1) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawCircle d1 = new drawCircle(this.l, this.Radius, Color.blue);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                if (color == 2) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawCircle d1 = new drawCircle(this.l, this.Radius, Color.green);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                if (color == 3) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawCircle d1 = new drawCircle(this.l, this.Radius, Color.yellow);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                if (color == 4) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawCircle d1 = new drawCircle(this.l, this.Radius, Color.orange);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                break;
            case 3:
                String r = JOptionPane.showInputDialog(null, "Nhập bán kính:");
                if(r != null){
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawCircle d1 = new drawCircle(this.l, Integer.parseInt(r), this.color);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                    
                }
            default:
                break;
        }
    }
}
