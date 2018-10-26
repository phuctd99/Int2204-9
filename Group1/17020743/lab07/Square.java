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
public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(int side,int x,int y){
        super(side,side,x,y);
    }
    public Square(int side,String color, boolean filled,int x,int y){
        super(side,side,color,filled,x,y);
    }
    // trả về cạnh của hình vuông
    public double getSide(){
        return super.getWidth();
    }
    // ghi đè phương thức để 2 cạnh luôn bằng nhau khi cài theo 1 chiều
    @Override
    public void setWidth(int side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(int side){
        super.setLength(side);
        super.setWidth(side);
    }
    //cài cạnh của hình vuông
    public void setSide(int side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
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
    private String color;
    private boolean filled;
}
