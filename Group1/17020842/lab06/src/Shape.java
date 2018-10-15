/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author CACLV
 */
abstract public class Shape {
    protected int x;
    protected int y;
    protected String color ;
    protected Shape (int _x, int _y, String _color) {
        x = _x; y = _y; color = _color;
    }
    
    abstract public void draw();
    abstract public void erase();
    
    public void moveTo(int _x, int _y){
        erase();
        x = _x; y = _y;
        draw();
    }
    
    public void output() {
        System.out.println("Tọa độ của hình là: " + "\nx: " + x + ", y: " + y);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
