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
public class Square extends Shape {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public void Input(){
		
		super.Input();
		System.out.println("Nhap do dai canh: ");
		length = super.sc.nextDouble();

	}
	
	public void Output() {
		
		super.Output();
		System.out.println("Do dai canh la : " + length);
	}
}
