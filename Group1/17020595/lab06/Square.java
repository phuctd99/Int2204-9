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
public class Square extends Shape {
    public double a_;
ArrayList<Shape> arr = new ArrayList<>();
    public void setDiem(){
        Scanner sc = new Scanner(System.in);
        for (int  i = 0; i < 3; i++){
            int x_ = sc.nextInt();
            int y_ = sc.nextInt();        
            Shape Diem = null;
            super.Diem(x_, y_);
            //super.
            arr.add(Diem);
        }
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double dienTinh(){
        return a*a;
    }
}
