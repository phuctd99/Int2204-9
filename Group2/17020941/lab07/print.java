package oop_tuan6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class print extends JPanel {
	List<Shape> listShape;
	print(List<Shape> listShape) {
		this.listShape = listShape;
	}
	
	public void color(String c, Graphics g) {
		if (c.equals("red")) {
			g.setColor(Color.red);
		} 
		else if(c.equals("blue")) {
			g.setColor(Color.blue);
		} 
		else if (c.equals("green")) {
			g.setColor(Color.green);
		} else {
			g.setColor(Color.black);
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.white);
		for (Shape shape : this.listShape) {
			if (shape instanceof Rectangle) {
				color(shape.getColor(), g);
				g.fillRect(shape.getX(), shape.getY(), shape.getWidth(), shape.getLength());
			}
			else if (shape instanceof Triangle && shape.getIsSquare() == false) {
				color(shape.getColor(), g);
				System.out.println(Arrays.toString(shape.getXT()));
				g.fillPolygon(shape.getXT(), shape.getYT(), 3);
			} 
			else if (shape instanceof Circle) {
				color(shape.getColor(), g);
				g.fillOval(shape.getX(), shape.getY(), shape.getRadius(), shape.getRadius());
			}
			else if (shape instanceof Hexagon) 
			{
				color(shape.getColor(),g);
				g.fillPolygon(shape.getxHex(), shape.getyHex(), 6);
			}
		}
	}
}
