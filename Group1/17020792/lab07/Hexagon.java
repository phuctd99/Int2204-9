/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author phamh
 */
public class Hexagon extends Shape{
    protected int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public boolean sameHexagon(Hexagon s2){
        if(this.l.getX() == s2.l.getX() && this.length == s2.length){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Hexagon{" + "length=" + length + '}';
    }
}
