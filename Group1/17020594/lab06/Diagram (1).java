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
public class Diagram {
    
    ArrayList<Layer> listLayer = new ArrayList<Layer>();
    public void addLayer() {
        Layer layer = new Layer();
	layer.setShape();
        listLayer.add(layer);
    }
     
    public void removeCirclefromLayer() {
	for(int i = 0 ; i < listLayer.size() ; i++) 
            listLayer.get(i).removeCircle();
			}
     public static void main(String[] args) {
        Diagram dg = new Diagram();
        dg.addLayer();
    }
}
		
		
		
		

		
		
	
		
		
