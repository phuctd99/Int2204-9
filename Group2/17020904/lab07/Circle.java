/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author SONY
 */
public class Circle extends Shape {
    private int radius = 10;
    private Location cricle ;

    public Circle(Color color, Location circle, int radius) {
        super(color);
        this.radius = radius;
        this.cricle = circle;
    }

    public Location getCircle() {
        return cricle;
    }

    public void setCircle(Location circle) {
        this.cricle = circle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    // di chuyển hình
    public void move(Location m){
        setCircle(m);
    }
    //Vẽ hình tròn
    @Override
     public void draw(Graphics g){
         g.setColor(getColor());
         g.fillOval(cricle.getX(),cricle.getY(), radius, radius);
     }

}
