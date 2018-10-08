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
public class Rectangle extends Shape{
	protected double width;
	protected double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	Rectangle(){
		this.width = 1.0;
		this.length = 1.0;
	}
        Rectangle(double width, double length){
            this.width = width;
            this.length = length;
        }
	Rectangle(double width, double length, String color, boolean filled){
                super(color,filled);
		this.width = width;
		this.length = length;
		
	}
	public double getArea(){
		return (width*length);
	}
	public double getPerimeter(){
		return (2*(width + length));
	}
	public String toString(){
		return "color "+this.getColor()+"\nfilled "+this.isFilled()
				+"\nArena "+this.getArea()+"\nPerimeter "+this.getPerimeter();
	}
}
