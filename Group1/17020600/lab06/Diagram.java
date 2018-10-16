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
    ArrayList<layer> llayer = new ArrayList<>();
    public void removecirclefromlayer(){
        for(int i = 0 ; i < llayer.size() ; i++) {
		llayer.get(i).removecircle();
	}
    }
    public void inputDiagram() {
	for(int i = 0 ; i < llayer.size() ; i++) {
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
    }

   
}
