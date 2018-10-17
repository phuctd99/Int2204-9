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
public class Triangle  extends Shape{
   double bottom;
   double height;

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
	public void Input() {
	
		super.Input();
		System.out.println("Nhap chieu dai: ");
		setHeight(sc.nextInt());
		System.out.println("Nhap chieu rong: ");
		setBottom(sc.nextInt());
		
	}
	
	
    @Override
	public void Output() {
		
		
		super.Output();
		
		System.out.println("Chieu dai: " + getBottom());
		System.out.println("Chieu rong: " +getHeight() );
		
		
	}
    
    
}
