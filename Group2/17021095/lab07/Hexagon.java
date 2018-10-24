/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btt6;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

/**
 *
 * @author SONY
 */
public class Hexagon extends Shape {
    Location x1 ;
    int measure;
    
    public Hexagon (Color color ,Location x1, int measure){
        super(color);
        this.x1 =x1;
        this.measure = measure;
    }

    public Location getX() {
        return x1;
    }

    public void setX(Location x1) {
        this.x1 = x1;
    }

    public int getMeasure() {
        return measure;
    }

    public void setMeasure(int measure) {
        this.measure = measure;
    }
    // di chuyển hình
    
    public void move(Location a){
        setX(a);
    }
    
    // hàm vẽ hình Hexagon
    @Override
     public void paintShape(Graphics s){
         Graphics2D g2d = (Graphics2D) s.create();
         GeneralPath hexagon = new GeneralPath();
         
         int a = getMeasure();
         
         hexagon.moveTo(x1.getX(), x1.getY());
         hexagon.lineTo(x1.getX()+a,x1.getY());
         hexagon.lineTo( x1.getX()+3*a/2, x1.getY()-a );
         hexagon.lineTo(x1.getX()+a,x1.getY()-2*a);
         hexagon.lineTo(x1.getX(),x1.getY()-2*a);
         hexagon.lineTo(x1.getX()-a/2,x1.getY()-a);
         hexagon.lineTo(x1.getX(),x1.getY());
         hexagon.closePath();
         
         g2d.setPaint(getColor());
         g2d.fill(hexagon);
     }
}
