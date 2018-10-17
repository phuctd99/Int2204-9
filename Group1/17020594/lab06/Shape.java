/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diagram;

import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public abstract class  Shape {
    private double x;
    private double y;
    Scanner sc = new Scanner(System.in);

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
public void Input() {
		
		System.out.println("Nhap toa do x: ");
		 x = sc.nextInt();
		System.out.println("Nhap toa do y: ");
		 y = sc.nextInt(); 
	}
	public void Output() {
		
		System.out.println("Toa do x: " + x);
		System.out.println("Toa do y: " + y);
	}
	public void move( int x, int y) {
		this.x = x;
		this.y = y;
	}
   
}

