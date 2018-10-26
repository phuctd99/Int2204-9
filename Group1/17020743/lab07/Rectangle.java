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
public class Rectangle extends Shape{
    private int width;
    private int length;
    private int coordinatesX;
    private int coordinatesY;
    //init
    public Rectangle(){
        this.length = 1;
        this.width = 1;
        this.coordinatesX = 0;
        this.coordinatesY = 0;
    }
    public Rectangle(int width,int length,int x,int y){
        this.length = length;
        this.width = width;
        this.coordinatesX = 0;
        this.coordinatesY = 0;
    }
    public Rectangle(int width,int length,String color, boolean filled,int x,int y){
        this.length = length;
        this.width = width;
        this.coordinatesX = 0;
        this.coordinatesY = 0;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }
    
    // trả về chiều rộng của hình chữ nhật
    @Override
    public int getWidth(){
        return this.width;
    }
    //cài chiều rộng của hình chữ nhật
    public void setWidth(int width){
        this.width = width;
    }
    //trả về chiều dài của hình chữ nhật
    public double getLength(){
        return this.length;
    }
    // cài chiều dài của hình chữ nhật
    public void setLength(int length){
        this.length = length;
    }
    // trả về diện tích của hình chữ nhật
    public double getArea(){
        return this.width*this.length;
    }
    // trả về chu vi của hình chữ nhật
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    @Override
    public void paint(Graphics g){
        if(this.filled)
            g.fillRect(coordinatesX, coordinatesY, width, length);
        else g.drawRect(coordinatesX, coordinatesY, width, length);
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
        final Rectangle other = (Rectangle) obj;
        if (this.width != other.width) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        if (this.coordinatesX != other.coordinatesX) {
            return false;
        }
        if (this.coordinatesY != other.coordinatesY) {
            return false;
        }
        return true;
    }
    
    private String color;
    private boolean filled;
}