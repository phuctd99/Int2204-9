package diagram;

import com.sun.prism.paint.Color;
import static java.awt.Color.RED;


public class Circle extends Shape{    
    private double radius;

    public Circle(int _x, int _y, String name, java.awt.Color color, double radius) {
        super(_x, _y,"Circle", java.awt.Color.DARK_GRAY);
        
    }

    Circle(int i, int i0, int i1, java.awt.Color BLUE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean sameCircle(  Circle c2 ){
        if(this.x == c2.x && this.y == c2.y && this.radius == c2.radius){
            return true;
        }
        else 
        {
            return false;
        }
        
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
