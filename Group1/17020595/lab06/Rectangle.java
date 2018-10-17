/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Rectangle extends Shape{
    public double a,b;
    Scanner sc = new Scanner(System.in);
    ArrayList<Shape> arr = new ArrayList<>();
    public int setDiem(){
        
        System.out.println("x cua diem A");
        int x_ = sc.nextInt();
        
        System.out.println("y cua diem A");
        int y_ = sc.nextInt();
        arr.add(super.Diem(x_, y_));
        
        System.out.println("x cua diem B");
        x = sc.nextInt();
        
        System.out.println("y cua diem B");
        y = sc.nextInt();
        arr.add(sup
                er.Diem(x_, y_));
        return 0;
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
    public double dienTich(){
        return a*b;
    }
}
