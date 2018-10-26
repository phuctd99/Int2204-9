/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author CCNE
 */
public class Location {
   private int x,y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
     public void setX(int x) {
        this.x = x;
    }

     public int getX() {
        return x;
    }
     public int getY() {
        return y;
    }
   
}
