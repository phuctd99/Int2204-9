/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diagram;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Layer  {
    static ArrayList <Shape> llayer = new ArrayList();
    public void setShape() {
        Shape circle = new Circle();
	circle.Input();
	llayer.add(circle);
        Shape triangle = new Triangle();
        triangle.Input();
        llayer.add(triangle);
        Shape retangle = new Retangle();
        retangle.Input();
        llayer.add(retangle);
        Shape  square = new Square();
        square.Input();
        llayer.add(square);
    
}
   
   
   
             public void removeCircle() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < llayer.size() ; i++) {
			if(llayer.get(i) instanceof Circle) {
			llayer.remove(i);
			--i;
                        }
		}
    }
    public void removeTriangle() {
		
		for(int i = 0 ; i < llayer.size() ; i++) {
			if(llayer.get(i) instanceof Triangle) {
			llayer.remove(i);
			--i;}
		}
	}
}
    

