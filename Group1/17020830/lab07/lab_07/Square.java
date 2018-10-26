/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

/**
 *
 * @author admin
 */
public class Square extends Shape{
    protected int side;
    public Square(String color,int x, int y, int side) {
        super(color,x,y);
        this.side = side;
    }
   
    
    public Square(){
        
    }
    
    public boolean compare_square(Square s){
        if(this.getSide() == this.getSide())
            return true;
        return false;
    }
    public Square(int side){
        this.side = side;
    }
    
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public void del(){
        System.out.println("sadsad");
        
    }
    
}
