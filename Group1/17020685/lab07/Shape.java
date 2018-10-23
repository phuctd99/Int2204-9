/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_6;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public abstract class Shape {
    Scanner scan = new Scanner(System.in);
    protected int x0;
    protected int y0;
    //Định nghĩa 2 phương thức abstract để bắt các lớp có 2 phương thức này
    public void input(){
        System.out.println("Nhap toa do x0: ");
        x0 = scan.nextInt();
        System.out.println("Nhap toa do y0: ");
        y0 = scan.nextInt();
    }
    
    public void output() {
        System.out.println("Toa do x0: " + x0);
        System.out.println("Toa do y0: " + y0);
    }
    
    public void Shape(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    
    
}
