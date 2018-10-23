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
public class Triangle extends Shape {

    private int x1,x2,y1,y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    
    
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap toa do x1: ");
        x1 = super.scan.nextInt();
        System.out.println("Nhap toa do y1: ");
        y1 = super.scan.nextInt();
        System.out.println("Nhap toa do x2: ");
        x2 = super.scan.nextInt();
        System.out.println("Nhap toa do y2: ");
        y2 = super.scan.nextInt();
    }
    
    @Override
    public void output(){
        System.out.println("Hinh Tam Giac");
        if ((getX0() != getX1()) && (getX1() != getX2()) && (getX2() != getX0()) && (getY0() != getY1()) && (getY1() != getY2()) && (getY2() != getY0())) {
            super.output();
            System.out.println("Toa do x1: " + x1);
            System.out.println("Toa do y1: " + y1);
            System.out.println("Toa do x2: " + x2);
            System.out.println("Toa do y2: " + y2);
        } else {
            System.out.println("Ko ton tai");
        }
    }
    
    public boolean sameTriangle(Triangle t) {
        if (t.x0 == x0 && t.x1 == x1 && t.x2 ==x2 && t.y0 == y0 && t.y1 == y1 && t.y2 == y2) {
            return true;
        }
        return false;
    }
}
