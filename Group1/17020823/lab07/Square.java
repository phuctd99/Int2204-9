/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author Hoang Vu Huong
 */
public class Square extends Rectangle{
    

   
    public int getSide(){
        return this.getHeigth();
    }
    public void setSide(int side){
        this.setWidth(side);
        this.setHeigth(side);
    }
    @Override
    public boolean Duplicate(Shape p) {
        if(this instanceof Square && p instanceof Square){
            Square a = (Square)p;
            return (this.getSide() == a.getSide() && this.Pointcenter.Duplicated(a.Pointcenter));
            
        }
        return false;
    }
    
}
