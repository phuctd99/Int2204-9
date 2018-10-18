/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_6;

/**
 *
 * @author HP
 */
public class Square extends Shape {

    private int x1,y1,x2,y2,x3,y3;

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

    
    
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap toa do x1: ");
        setX1(super.scan.nextInt());
        System.out.println("Nhap toa do y1: ");
        setY1(super.scan.nextInt());
        System.out.println("Nhap toa do x2: ");
        setX2(super.scan.nextInt());
        System.out.println("Nhap toa do y2: ");
        setY2(super.scan.nextInt());
        System.out.println("Nhap toa do x3: ");
        setX3(super.scan.nextInt());
        System.out.println("Nhap toa do y3: ");
        setY3(super.scan.nextInt());
    }
    
    @Override
     public void output(){
        System.out.println("Hinh Vuong");
        if ((getX0() == getX1()) && (getY0() == getY3()) && (getY1() == getX2()) && (getX3() == getX2()) && Math.abs(getX0()-getX1())==Math.abs(getX2()-getX3()) ) {
            super.output();
            System.out.println("Toa do x1: " + getX1());
            System.out.println("Toa do y1: " + getY1());
            System.out.println("Toa do x2: " + getX2());
            System.out.println("Toa do y2: " + getY2());
            System.out.println("Toa do x3: " + getX3());
            System.out.println("Toa do y3: " + getY3());
        } else {
            System.out.println("Ko ton tai");
        }
     }
}
