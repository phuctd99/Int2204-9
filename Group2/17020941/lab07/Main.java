package oop_tuan6;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Main {
	 public static void main(String[] args) {
	        // write your code here
	        Shape retangle = new Rectangle(100, 200);
	        Shape triangle = new Triangle();
	        Shape retangle1 = new Rectangle(50, 50, "red", 100, 200);
	        Shape retangle2 = new Rectangle(50, 50, "green", 100, 200);
	        Shape square1 = new Square(50,50,"blue",30);
	        int[] xHex = {37,62,150,194,149,63};
	        int[] yHex = {120,44,44,120,199,199};
	        Shape hexagon = new Hexagon(400,400,"red",xHex, yHex);
	        int[] xT = {20,50,80};
	        int[] yT = {80,20,80};
	        Shape triangle1 = new Triangle(10, 10, "red", xT, yT);
	        Shape circle = new Circle(300,300,"green", 60);
	        Layer layer = new Layer("layer1");
	        Layer layer2 = new Layer("layer2");
	        layer.addShape(retangle);
	        layer.addShape(retangle1);
	        layer.addShape(square1);
	        layer.addShape(retangle2);
	        layer2.addShape(triangle1);
	        layer2.addShape(triangle);
	        layer2.addShape(circle);
	        layer2.addShape(hexagon);
	        Diagram diagram = new Diagram();
	        diagram.addLayer(layer);
	        diagram.addLayer(layer2);
	        diagram.showAllLayer();	        
	        diagram.listLayer.get(0).setVisiable(false);
	        diagram.showAllLayer();
	        diagram.printShape();
	        diagram.removeSameShape();
	        diagram.removeAllCircle();

	    }
}
