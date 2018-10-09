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
public class Circle extends Shape{
	final double PI = 3.14;
	
	private double radius;
	Circle(){
		this.radius = 1.0;
	}
	Circle(double radius){
		this.radius = radius;
	}
	Circle(double radius, String color, boolean filled){
		this.radius = radius;
		this.color = color;
                this.filled = filled;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return (PI*radius*radius);
	}
	public double getPerimeter(){
		return (2*PI*radius);
	}
	public String toString(){
		return "color "+this.getColor()+"\nfilled "+this.isFilled()
				+"\nArena "+this.getArea()+"\nPerimeter "+this.getPerimeter();
	}
}
