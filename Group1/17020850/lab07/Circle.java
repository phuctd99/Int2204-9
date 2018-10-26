
//package lab06;
package lab06;

import java.awt.Graphics;




public class Circle extends Shape {
    protected int radius;

    @Override
    public void input() {
        super.input();
        
        radius = super.scan.nextInt();
    }

    @Override
    public void output() {

        super.output();
        System.out.println("Ban kinh: " + radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void draw(Graphics g)
    {
        if(this.isColor())
        {
            
            g.fillOval(this.getX(), this.getY(), this.getRadius(), this.getRadius());
        }
        else
        {
            g.drawOval(this.getX(), this.getY(), this.getRadius(), this.getRadius());
        }
    }


}
