/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diagram;

/**
 *
 * @author CCNE
 */
public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void Input() {
		super.Input();
		System.out.println("Nhap ban kinh hinh tron: ");
		setRadius(sc.nextDouble());
		
	}
	
	
	
    @Override
	public void Output() {
		
		
		super.Output();
		System.out.println("Ban kinh la: " + radius);
	
	}
    
}
