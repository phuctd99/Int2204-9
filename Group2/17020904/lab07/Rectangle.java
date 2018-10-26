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
public class Rectangle extends Shape {
   
   public Location rectangle;
   private int x1 ;
   private int y1 ;

    public Rectangle(Color color) {
        super(color);
    }
    public Rectangle(Color color, int x1, int y1, Location rectangle ) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        
        this.rectangle = rectangle;
    }
   
    public Location getRectangle() {
        return rectangle;
    }

    public void setRectangle(Location rectangle) {
        this.rectangle = rectangle;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x) {
        this.x1 = x;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y) {
        this.y1 = y;
    }
    // di chuyển hình 
    public void move(Location a){
        setRectangle(a);
    }

  //vẽ hình Chữ Nhật
    @Override
     public void draw(Graphics g){
         g.setColor(getColor());
         g.fillRect(rectangle.getX(), rectangle.getY(),x1, y1);
     }

   
}
