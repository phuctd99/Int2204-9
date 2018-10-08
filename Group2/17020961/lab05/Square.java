/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5;

/**
 *
 * @author CCNE
 */
public class Square extends Rectangle{
	
	public double getSide() {
		return super.width;
	}
	public void setSide(double side) {
		super.width = side;
                super.length = side;
	}
        public void setWidth(double x){
                this.width = x;
                this.length = x;
        }
        public void setLength(double x){
                this.width = x;
                this.length = x;
        }
	Square(){
		super();
	}
	Square(double side){
		super(side,side);
	}
	Square(double side, String color, boolean filled){
		super.width = side;
                super.length = side;
		this.color = color;
                this.filled = filled;
	}
	public String toString(){
            return super.toString();
	}
}
