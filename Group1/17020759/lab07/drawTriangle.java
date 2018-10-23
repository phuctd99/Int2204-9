/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Draw;

import com.Shape.Location;
import com.Shape.Triangle;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author phixuanhoan
 */
public class drawTriangle extends Triangle{
    public drawTriangle(Location l1, Location l2, Location l3, Color color) {
        this.l = l1;
        this.l1 = l2;
        this.l2 = l3;
        this.color = color;
    }
    JPanel com;
    int width;
    int height;
    public JPanel draw() {
        Color c = this.color;
        int width = Math.max(l.getX(),Math.max(l1.getX(),l2.getX())) -  Math.min(l.getX(),Math.max(l1.getX(),l2.getX())) + 1;
        int height = Math.max(l.getY(),Math.max(l1.getY(),l2.getY())) -  Math.min(l.getY(),Math.max(l1.getY(),l2.getY())) +1;
        int gx = Math.min(l.getX(),Math.max(l1.getX(),l2.getX()));
        int gy = Math.min(l.getY(),Math.max(l1.getY(),l2.getY()));
        int []x = {l.getX(),l1.getX(),l2.getX()};
        int []y = {l.getY(),l1.getY(),l2.getY()};
        com = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(c);
                g.fillPolygon(x, y, 3);
            }
        };
        com.setSize(width, height);
        com.setLocation(gx, gy);
        com.setName("tria");
        com.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePressTriangle(evt);
            }

        });
        return com;
        
    }
    public void mousePressTriangle(java.awt.event.MouseEvent evt){
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
                String _x1 = JOptionPane.showInputDialog(null, "Nhập x1 :");
                String _y1 = JOptionPane.showInputDialog(null, "Nhập y1 :");
                String _x2 = JOptionPane.showInputDialog(null, "Nhập x2 :");
                String _y2 = JOptionPane.showInputDialog(null, "Nhập y2 :");
                String _x3 = JOptionPane.showInputDialog(null, "Nhập x3 :");
                String _y3 = JOptionPane.showInputDialog(null, "Nhập y3 : ");
                if (_x1 != null && _y1 != null) {
                    drawTriangle d1 = new drawTriangle( new Location(Integer.parseInt(_x1), Integer.parseInt(_y1)),
                                                new Location(Integer.parseInt(_x2), Integer.parseInt(_y2)),
                                                new Location(Integer.parseInt(_x3), Integer.parseInt(_y3)),
                                                this.color);
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                }                // Delete
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
                    drawTriangle d1 = new drawTriangle(this.l, this.l1,this.l2, Color.red);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    
                }
                if (color == 1) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawTriangle d1 = new drawTriangle(this.l, this.l1,this.l2, Color.blue);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    
                }
                if (color == 2) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawTriangle d1 = new drawTriangle(this.l, this.l1,this.l2, Color.green);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    
                }
                if (color == 3) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawTriangle d1 = new drawTriangle(this.l, this.l1,this.l2, Color.yellow);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    
                }
                if (color == 4) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawTriangle d1 = new drawTriangle(this.l, this.l1,this.l2, Color.ORANGE);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                
                }
                break;
            case 3:
                String _cx1 = JOptionPane.showInputDialog(null, "Nhập x1 :");
                String _cy1 = JOptionPane.showInputDialog(null, "Nhập y1 :");
                String _cx2 = JOptionPane.showInputDialog(null, "Nhập x2 :");
                String _cy2 = JOptionPane.showInputDialog(null, "Nhập y2 :");
                String _cx3 = JOptionPane.showInputDialog(null, "Nhập x3 :");
                String _cy3 = JOptionPane.showInputDialog(null, "Nhập y3 : ");
                if (_cx1 != null && _cy1 != null) {
                    drawTriangle d1 = new drawTriangle( new Location(Integer.parseInt(_cx1), Integer.parseInt(_cy1)),
                                                new Location(Integer.parseInt(_cx2), Integer.parseInt(_cy2)),
                                                new Location(Integer.parseInt(_cx3), Integer.parseInt(_cy3)),
                                                this.color);
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                }
            default:
                break;
              
        }
    }
}
