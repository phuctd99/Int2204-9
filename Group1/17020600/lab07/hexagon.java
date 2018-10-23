/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author pc
 */
public class hexagon extends shape {
    
	
	public int Length;
	public boolean sameHexagon(hexagon hx1) {
		
		return x == hx1.x && y == hx1.y && Length == hx1.Length;
	}
	public void Input() {
		
		super.input();
		System.out.println("Nhap chieu dai canh: ");
		Length = super.scan.nextInt();
		
	}
	
	public void Output() {
		super.output();
		System.out.println("Chieu dai canh: " + Length);
		
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}
}
