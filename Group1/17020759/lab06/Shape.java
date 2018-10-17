/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shape;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author phixuanhoan
 */
 //Các hình có thể được tô màu hoặc được di chuyển
public abstract class Shape {
    Scanner scan = new Scanner(System.in);
    protected Location l = new Location();
    protected Color color;
    public void move(Location l1){
        this.l.setX(l1.getX());
        this.l.setY(l1.getY());
        
    }
    //Định nghĩa 2 phương thức abstract để bắt các lớp có 2 phương thức này
    public void input(){
        l.inPut();
    }
    public void output(){
        l.outPut();
    }
    
    public void paint(Color color){
        this.color = color;
    }
    /**
     * @return the l
     */
    public Location getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(Location l) {
        this.l = l;
    }
    
}
