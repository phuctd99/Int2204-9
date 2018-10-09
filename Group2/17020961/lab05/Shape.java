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
public class Shape {
        protected String color;
	protected boolean filled;
	Shape(){
		this.color = "red";
		this.filled = true;
	}
	Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString(){
		return "color "+this.color+"\nfilled "+this.filled;
	}
}
