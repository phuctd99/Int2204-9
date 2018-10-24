/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

/**
 *
 * @author CACLV
 */


public class Location2D {
    private int x;
    private int y;

    public Location2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Location2D() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distance(Location2D location2D) {
        return Math.sqrt((this.x - location2D.x) * (this.x - location2D.x) + (this.y - location2D.y) * (this.y - location2D.y));
    }
    public boolean isSame(Location2D loca) {
        return (this.x == loca.x && this.y == loca.y);
    }
    
}
