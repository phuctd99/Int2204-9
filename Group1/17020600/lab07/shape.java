/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class shape {
    protected int x;
    protected int y;
    Scanner scan = new Scanner(System.in);
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void input() {
		
		System.out.println("Nhap x ");
		 x = scan.nextInt();
		System.out.println("Nhap y ");
		 y = scan.nextInt(); 
	}
	public void output() {
		
		System.out.println("x " + x);
		System.out.println("y " + y);
	}
	public void move( int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void paint() {
            
	}
}
