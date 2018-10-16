/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap06;

/**
 *
 * @author Hoang Vu Huong
 */
public class Square extends Shape{
    private int side;

    public Square(int _x, int _y, String _color, int _side) {
        super(_x, _y, _color);
        side = _side;
    }
    
    @Override
    public void draw(){
        System.out.println("Draw Square");
    }
    
    @Override
    public void erase(){
        System.out.println("Erase Square");   
    }

    @Override
    public void output() {
        System.out.println("------Square-------");
        super.output();
        System.out.println("kích thước hình: " + side);
        System.out.println();
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
