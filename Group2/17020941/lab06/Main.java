package oop_tuan6;

import javax.swing.JFrame;

public class Main extends JFrame{
		public Main() {
			setSize(500, 500);
			setLocation(500, 500);
			setVisible(true);
		}
		
		
		
		public static void main(String[] args) {
	        Shape retangle = new Rectangle(30, 60);	
	        Main testMain = new Main();
	    }
}
