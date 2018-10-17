/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shape;

/**
 *
 * @author phixuanhoan
 */
public class Rectangle extends Shape{
    protected Location l1 = new Location();
    protected Location l2 = new Location();
    protected Location l3 = new Location();
    @Override
    public void input(){
        super.input();
        l1.inPut();
        l2.inPut();

    }
    @Override
    public void output(){
        System.out.println("===== Rectangle =====");
        super.output();
        l1.outPut();
        l2.outPut();
    }
    
    public boolean sameRectangle(Rectangle r2) {
        if (this.l1.sameLocation(r2.l1) && this.l2.sameLocation(r2.l2) && this.l3.sameLocation(r2.l3) && l.sameLocation(r2.l)) {
            return true;
        }

        return false;
    }
}
