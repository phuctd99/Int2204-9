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
public class Circle extends Shape {
    private double r = 1;
    
    Circle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double getR() {
        return r;
    }
    ArrayList<Shape> arr = new ArrayList<>();
    public void setDiem(){
        Scanner sc = new Scanner(System.in);
        for (int  i = 0; i < 3; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();        
            Shape Diem = null;
            super.Diem(x, y);
            arr.add(Diem);
        }
    }

    public void setR(double r) {
        this.r = r;
    }
    public double dienTich(){
        return 3.14*r*r;
    }
}
