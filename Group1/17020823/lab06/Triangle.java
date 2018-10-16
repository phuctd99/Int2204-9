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
public class Triangle extends Shape{
     private  int a, b, c;

    public Triangle(int _x, int _y, String _color, int _a, int _b, int _c) {
        super(_x, _y, _color);
        a = _a; b =_b; c = _c;
    }
    
    @Override
    public void draw(){
        System.out.println("Draw Triangle");
    }
    
    @Override
    public void erase(){
        System.out.println("Erase Triangle");   
    }
    
    @Override
    public void output(){
        System.out.println("------Triangle-------");
        super.output();
        System.out.println("độ dài ba cạnh: " + a + " " + b + " " + c);
        System.out.println();
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}
