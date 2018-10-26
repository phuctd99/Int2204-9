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
public class Hexagon extends Shape {
    Location x1, x2, x3, x4, x5, x6;

    
    public Hexagon (Color color ,Location x1, Location x2,Location x3,Location x4,Location x5,Location x6){
        super(color);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;

    }

    public Location getX1() {
        return x1;
    }

    public void setX1(Location x) {
        this.x1 = x;
    }
    public Location getX2() {
        return x2;
    }

    public void setX2(Location x) {
        this.x2 = x;
    }
    public Location getX3() {
        return x3;
    }

    public void setX3(Location x) {
        this.x3 = x;
    }public Location getX4() {
        return x4;
    }

    public void setX4(Location x) {
        this.x4 = x;
    }
    public Location getX5() {
        return x5;
    }

    public void setX5(Location x) {
        this.x5 = x;
    }
    public Location getX6() {
        return x6;
    }

    public void setX6(Location x) {
        this.x6 = x;
    }

    // di chuyển hình
    
    public void move(Location x1, Location x2,Location x3,Location x4,Location x5,Location x6){
        setX1(x1);
        setX2(x2);
        setX3(x3);
        setX4(x4);
        setX5(x5);
        setX6(x6);
    }
    
    // vẽ hình Hexagon
    @Override
     public void draw(Graphics g){
         Graphics2D g2d = (Graphics2D) g.create();
         GeneralPath hexagon = new GeneralPath();
         
         hexagon.moveTo(x1.getX(), x1.getY());
         hexagon.lineTo(x1.getX(),x1.getY());
         hexagon.lineTo(x2.getX(),x2.getY());
         hexagon.lineTo( x3.getX(), x3.getY() );
         hexagon.lineTo(x4.getX(),x4.getY());
         hexagon.lineTo(x5.getX(),x5.getY());
         hexagon.lineTo(x6.getX(),x6.getY());
         
         hexagon.closePath();
         
         g2d.setPaint(getColor());
         g2d.fill(hexagon);
     }
}
