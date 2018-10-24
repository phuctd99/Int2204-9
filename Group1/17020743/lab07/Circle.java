/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.awt.Graphics;

/**
 *
 * @author Liscli
 */
public class Circle extends Shape {
    private int radius;
    private final double PI = 3.14159265359;
    private int centerX;
    private int centerY;
    // init
    public Circle(){
        radius = 1;
        centerX= 0;
        centerY= 0;
    }

    public Circle(int radius, int centerX, int centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }
    
    public Circle(int radius, int centerX, int centerY, String color, boolean filled) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.color = color;
        this.filled = filled;
    }
    // trả về bán kính của hình tròn
    public int getRadius(){
        return this.radius;
    }
    //cài chỉ số của bán kính hình tròn
    public void setRadius(int radius){
        this.radius = radius;
    }
    //trả về diện tích của hình tròn
    public double getArea(){
        return this.PI*this.radius*this.radius;
    }
    //trả về chu vi của hình tròn
    public double getPerimeter(){
        return 2*this.PI*this.radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }
    @Override
    public void paint(Graphics g){
        if(this.filled)
            g.fillOval(centerX, centerY,radius , radius);
        else g.drawOval(centerX, centerY,radius , radius);
    }
    
    @Override
    public String getColor(){
        return this.color;
    }
    //cài màu của hình
    @Override
    public void setColor(String color){
        this.color = color;
    }
    //trả về có đầy hay không 
    @Override
    public boolean isFilled(){
        return this.filled;
    }
    //cài trạng thái đày hay không đầy
    @Override
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;
        if (this.radius != other.radius) {
            return false;
        }
        if (this.centerX != other.centerX) {
            return false;
        }
        if (this.centerY != other.centerY) {
            return false;
        }
        return true;
    }
    
    private String color;
    private boolean filled;
}