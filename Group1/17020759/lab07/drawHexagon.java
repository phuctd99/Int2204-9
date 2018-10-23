/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Draw;

import com.Shape.Hexagon;
import com.Shape.Location;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author phixuanhoan
 */
public class drawHexagon extends Hexagon{
    public drawHexagon(Location l, int length, Color color) {
        this.l = l;
        this.length = length;
        this.color = color;
    }
    Component com;
    public Component draw() {
        Color c = this.color;
        int x = length;
        int y = length;
        int x1 = x - length;
        int y1 = y;
        int x2 = x - (int)(length * Math.cos(Math.PI/3)) ;
        int y2 = y - (int)(length * Math.sin(Math.PI/3)) ;
        int x3 = x + (int)(length * Math.cos(Math.PI/3)) ;
        int y3 = y - (int)(length * Math.sin(Math.PI/3)) ;
        int x4 = x + length ;
        int y4 = y ;
        int x5 = x + (int)(length * Math.cos(Math.PI/3)) ;
        int y5 = y + (int)(length * Math.sin(Math.PI/3)) ;
        int x6 = x - (int)(length * Math.cos(Math.PI/3)) ;
        int y6 = y + (int)(length * Math.sin(Math.PI/3)) ;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
                System.out.println(x6);


        com = new Component() {
            @Override
            public void paint(Graphics g) {
                g.setColor(c);
                g.fillPolygon(new int[] {x1,x2,x3,x4,x5,x6}, new int[] {y1,y2,y3,y4,y5,y6}, 6);
            }
        };
        com.setSize(length*2, length*2);
        com.setLocation(l.getX() -length, l.getY() - length);
        com.setName("hex");
        System.out.println(l.getX()+ "-" + (l.getY()));
        System.out.print("Hello");
        com.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePressHexagon(evt);
            }

        });
        return com;
        
    }
    public void mousePressHexagon(java.awt.event.MouseEvent evt) {
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
                    com.setLocation(Integer.parseInt(x) -length, Integer.parseInt(y) - length);
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
                    drawHexagon d1 = new drawHexagon(this.l, this.length, Color.red);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    
                }
                if (color == 1) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawHexagon d1 = new drawHexagon(this.l, this.length, Color.blue);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    
                }
                if (color == 2) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawHexagon d1 = new drawHexagon(this.l, this.length, Color.green);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    
                }
                if (color == 3) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawHexagon d1 = new drawHexagon(this.l, this.length, Color.yellow);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    
                }
                if (color == 4) {
                    com.getParent().getParent().setSize(900, 701);
                    com.getParent().getParent().setSize(900, 700);
                    com.getParent().remove(com);
                    drawHexagon d1 = new drawHexagon(this.l, this.length, Color.ORANGE);
                    drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                
                }
                break;
            case 3:
                String w;
                w = JOptionPane.showInputDialog(null, "Nhập độ dài cạnh:");
                if(w != null){
                        com.getParent().getParent().setSize(900, 701);
                        com.getParent().getParent().setSize(900, 700);
                        com.getParent().remove(com);
                        drawHexagon d1 = new drawHexagon(this.l, Integer.parseInt(w), this.color);
                        drawForm.arrLayout.get(drawForm.layout).add(d1.draw());
                    }
            default:
                break;
        }
    }
}
