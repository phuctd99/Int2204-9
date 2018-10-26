/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

/**
 *
 * @author SONY
 */
public class Triangle extends Shape {   
    private Location x1 ;
    private Location x2 ;
    private Location x3 ;
    
    

    public Triangle(Color color,Location x1,Location x2, Location x3) {
        super(color);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        
    }
    
    public Location getX1() {
        return x1;
    }

    public void setX1(Location x1) {
        this.x1 = x1;
    }

    public Location getX2() {
        return x2;
    }

    public void setX2(Location x2) {
        this.x2 = x2;
    }

    public Location getX3() {
        return x3;
    }

    public void setX3(Location x3) {
        this.x3 = x3;
    }
    
    
    // di chuyển hình
    public void move(Location a, Location b, Location c){
        setX1(a);
        setX2(a);
        setX3(a);              
    }
    //hàm vẽ hình Triangle
    @Override
     public void draw(Graphics g){
         Graphics2D g2d = (Graphics2D) g.create();
         GeneralPath triangle = new GeneralPath();
         
         
         triangle.moveTo(x2.getX(), x2.getY());
         triangle.lineTo(x2.getX(), x2.getY());
         triangle.lineTo(x3.getX(), x3.getY());
         triangle.lineTo(x1.getX(), x1.getY());
         triangle.closePath();
         
         g2d.setPaint(getColor());
         g2d.fill(triangle);
                        
     }
    
}
