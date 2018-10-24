
package diagram;

import java.awt.Color;

public class Square extends Shape{
    private int side;

    public Square(int _x, int _y, String name, Color color,int side) {
        super(_x, _y,"Square", Color.GREEN);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    
 //To change body of generated methods, choose Tools | Templates.
    }
