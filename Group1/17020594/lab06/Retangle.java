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
public class Retangle  extends Shape {
    private double width ;
    private double length ;

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
    @Override
    public void Input() {
		super.Input();
		System.out.println("Nhap chieu dai: ");
		setLength(sc.nextDouble());
		System.out.println("Nhap chieu rong: ");
		setWidth(sc.nextDouble());
		
	}
    @Override
	public void Output() {
		super.Output();
		System.out.println("Chieu dai: " + getLength());
		System.out.println("Chieu rong: " + getWidth());
	
	}
    
}
