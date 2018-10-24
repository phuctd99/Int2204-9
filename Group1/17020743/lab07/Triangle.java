/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.awt.Graphics;
import java.util.Arrays;

/**
 *
 * @author CCNE
 */
public class Triangle extends Shape{
    private int[] a;
    private int[] b;
    private int[] c;

    public Triangle(){
        a = new int[2];
        b = new int[2];
        c = new int[2];
    }
    public void setA(int x,int y){
        this.a[0] = x;
        this.a[1] = y;
    }
    public void setB(int x,int y){
        this.b[0] = x;
        this.b[1] = y;
    }
    public void setC(int x,int y){
        this.c[0] = x;
        this.c[1] = y;
    }

    public int[] getA() {
        return a;
    }

    public int[] getB() {
        return b;
    }

    public int[] getC() {
        return c;
    }
    public void paint(Graphics g){
        int x[] = {a[0],b[0],c[0]};
        int y[] = {a[1],b[1],c[1]};
        if(this.filled)
            g.drawPolygon(x,y,3);
        else g.fillPolygon(x,y,3);
    }
    @Override
    public String getColor(){
        return this.color;
    }
    //cài màu của hình
    @Override
    public void setColor(String color){
        this.color = color;
    }
    //trả về có đầy hay không 
    @Override
    public boolean isFilled(){
        return this.filled;
    }
    //cài trạng thái đày hay không đầy
    @Override
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangle other = (Triangle) obj;
        if (!Arrays.equals(this.a, other.a)) {
            return false;
        }
        if (!Arrays.equals(this.b, other.b)) {
            return false;
        }
        if (!Arrays.equals(this.c, other.c)) {
            return false;
        }
        return true;
    }
    
    private String color;
    private boolean filled;
}
