
package com.Draw;

import com.Shape.Location;
import com.Shape.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author phixuanhoan
 */
public class drawRactangle extends Rectangle{
    public drawRactangle(Location l1, Location l2, Location l3, Location l4, Color color) {
        this.l = l1;
        this.l1 = l2;
        this.l2 = l3;
        this.l3 = l4;
        this.color = color;
    }
    JPanel com;
    int width;
    int height;
    public JPanel draw() {
        Color c = this.color;
        width = l1.getX() - l.getX();
        height = l3.getY() - l.getY();
        com = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(c);
                g.fillRect(0, 0, width, height);
            }
        };
        com.setSize(l1.getX() - l.getX(), l3.getY() - l.getY());
        com.setLocation(l.getX(), l.getY());
        if(width == height){
            com.setName("squa");
        } else {
            com.setName("rec");
        }
        
        com.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePressRectangle(evt);
            }

        });
        return com;
        
    }
    public void mousePressRectangle(java.awt.event.MouseEvent evt) {
        Object[] options = {"Delete", "Move", "Change Color", "Change width"};
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
                    this.l1.setX(Integer.parseInt(x) + width);
                    this.l1.setY(Integer.parseInt(y));
                    this.l2.setX(Integer.parseInt(x) + width);
                    this.l2.setY(Integer.parseInt(y) + height);
                    this.l3.setX(Integer.parseInt(x));
                    this.l3.setY(Integer.parseInt(y) + height);
                    com.setLocation(l.getX(), l.getY());
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
                    drawRactangle d1 = new drawRactangle(this.l, this.l1, this.l2,this.l3, Color.red);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                if (color == 1) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawRactangle d1 = new drawRactangle(this.l, this.l1, this.l2,this.l3, Color.blue);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                if (color == 2) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawRactangle d1 = new drawRactangle(this.l, this.l1, this.l2,this.l3, Color.green);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                if (color == 3) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawRactangle d1 = new drawRactangle(this.l, this.l1, this.l2,this.l3, Color.yellow);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                if (color == 4) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    drawRactangle d1 = new drawRactangle(this.l, this.l1, this.l2,this.l3, Color.orange);
                    com.getParent().add(d1.draw());
                    com.getParent().remove(com);
                }
                break;
            case 3:
                String w;
                String h;
                if(this.height == this.width){
                    w = JOptionPane.showInputDialog(null, "Nhập độ dài cạnh:");
                    h = w;
                } else {
                    w = JOptionPane.showInputDialog(null, "Nhập chiều dài:");
                    h = JOptionPane.showInputDialog(null, "Nhập chiều rộng:");
                }
                
                if(w != null){
                        com.getParent().getParent().setSize(900, 701);
                        com.getParent().getParent().setSize(900, 700);
                        this.l1.setX(l.getX() + Integer.parseInt(w));
                        this.l1.setY(l.getY());
                        this.l2.setX(l.getX() + Integer.parseInt(w));
                        this.l2.setY(l.getY() +Integer.parseInt(h));
                        this.l3.setX(l.getX());
                        this.l3.setY(l.getY() + Integer.parseInt(h));
                        drawRactangle d1 = new drawRactangle(this.l, this.l1,this.l2, this.l3, this.color);
                        com.getParent().add(d1.draw());
                        com.getParent().remove(com);
                    }
            default:
                break;
        }
    }
}
