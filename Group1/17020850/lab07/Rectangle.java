package lab06;

//import java.util.Scanner;

import java.awt.Graphics;


public class Rectangle extends Shape {
    protected int length, width;

    public Rectangle() {
    }
    
    public Rectangle(int length,int width,boolean  canMove, boolean  color)
    {
        this.canMove= canMove;
        this.color=color;
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public void input() {
        
        super.input();
        
        setLength(super.scan.nextInt());
        
        setWidth(super.scan.nextInt());
    }

   public void draw (Graphics g)
   {
        if(this.isColor())
        {
            
            g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getLength());
        }
        else
        {
            g.drawRect(this.getX(), this.getY(), this.getWidth(), this.getLength());
        }
   }

}