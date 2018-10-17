/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan6;

/**
 *
 * @author CCNE
 */
// tam giác
public class Triangle extends Shape{

    private int x1, y1;
    private int x2, y2;
    private int x3, y3;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public Triangle() {
        this.x1 = 1;
        this.y1 = 2;
        this.x2 = 3;
        this.y2 = 4;
        this.x3 = 5;
        this.y3 = 2;
    }
    
    public void printTriangle(){
        System.out.println("toa do diem dau : " + this.x1 + "," + this.y1);
        System.out.println("toa do diem t2 : " + this.x2 + "," + this.y2);
        System.out.println("toa do diem t3 : " + this.x3 + "," + this.y3);
    }
    public int ktTriangle(){
        return Math.abs((this.x2 - this.x1)*(this.y3 - this.y1) - (this.y3 - this.x1)*(this.y2 - this.y1));
    }
}
