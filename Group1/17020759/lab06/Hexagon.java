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
public class Hexagon extends Shape{
    protected int length;
    @Override
    public void input(){
        super.input();
        System.out.print("Nhập độ dài cạnh: ");
        length = super.scan.nextInt();
    }
    @Override
    public void output(){
        System.out.println("===== Hexagon =====");
        super.output();
        System.out.print("Độ dài cạnh: " + length);
    }
    public boolean sameHexagon(Hexagon s2){
        if(this.l.getX() == s2.l.getX() && this.length == s2.length){
            return true;
        }
        return false;
    }
}
