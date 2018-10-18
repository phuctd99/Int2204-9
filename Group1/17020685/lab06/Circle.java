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
public class Circle extends Shape{
    private int radius;

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap ban kinh: ");
        radius = super.scan.nextInt();
    }
    
    @Override
    public void output() {
        System.out.println("Hinh Tron");
        super.output();
        System.out.println("Ban kinh: " + radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    

    
    
}
