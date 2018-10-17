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
public class Rectangle extends Shape {
    private int length, width;

    public Rectangle(int _x, int _y, String _color, int _length, int _width) {
        super(_x, _y, _color);
        length = _length; width = _width;
    }
    
    @Override
    public void draw(){
        System.out.println("Draw Rectangle");
    }
    
    @Override
    public void erase(){
        System.out.println("Erase Rectangle");   
    }

    @Override
    public void output() {
        System.out.println("------Rectangle-------");
        super.output();
        System.out.println("chiều dài và chiều rộng: " + length + " " + width);
        System.out.println();
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
    
    
}
