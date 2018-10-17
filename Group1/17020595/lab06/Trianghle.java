/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t6;

import java.util.ArrayList;
import java.util.Scanner;

public class Trianghle extends Shape {
    private double a = 1,b = 1, c = 1;
    ArrayList<Shape> arr = new ArrayList<>();
    public void setDiem(){
        Scanner sc = new Scanner(System.in);
        for (int  i = 0; i < 3; i++){
            int x_ = sc.nextInt();
            int y_ = sc.nextInt();        
            Shape Diem = null;
            super.Diem(x_, y_);
            arr.add(Diem);
        }
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double chuVi(){
        return a + b + c;
    }
}
