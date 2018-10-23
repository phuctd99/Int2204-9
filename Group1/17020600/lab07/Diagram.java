/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Diagram {
    layer lrrectangle = new layer();
    layer lrsquare = new layer();
    layer lrshape = new layer();
    layer lrcircle = new layer();
    layer lrtriangle = new layer();
    layer lrhexagon = new layer();
    ArrayList<layer> llayer = new ArrayList<>();
    public void removecirclefromlayer(){
        for(int i = 0 ; i < llayer.size() ; i++) {
		llayer.get(i).removecircle();
	}
    }
    public void move_Shape_to_layer(){
        for(int i = 0 ; i < llayer.size() ; i++) {
            for(int j = 0 ; j < llayer.get(i).Alayer.size() ; j++) {
                
		if(llayer.get(i).Alayer.get(j) instanceof circle) {
                    
                    lrcircle.Alayer.add(llayer.get(i).Alayer.get(j));
		}
		else if(llayer.get(i).Alayer.get(j) instanceof rectangle) {
					
                    lrrectangle.Alayer.add(llayer.get(i).Alayer.get(j));
		}
		else if(llayer.get(i).Alayer.get(j) instanceof square) {
					
                    lrsquare.Alayer.add(llayer.get(i).Alayer.get(j));
		}
		else if(llayer.get(i).Alayer.get(j) instanceof triangle) {
					
                    lrtriangle.Alayer.add(llayer.get(i).Alayer.get(j));
		}
                else if(llayer.get(i).Alayer.get(j) instanceof hexagon) {
					
                    lrhexagon.Alayer.add(llayer.get(i).Alayer.get(j));
		}
				
            }
			
        }
    }
    public void inputDiagram(int n) {
	for(int i = 0 ; i < n ; i++) {
	layer newlayer = new layer();
	newlayer.input();
	llayer.add(newlayer);		
	}
    }
    public void outputDiagram() {
	for(int i = 0 ; i < llayer.size() ; i++) {
            llayer.get(i).outputLayer();
	}
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram dg = new Diagram();
        dg.inputDiagram(1);
        dg.outputDiagram();
    }

   
}