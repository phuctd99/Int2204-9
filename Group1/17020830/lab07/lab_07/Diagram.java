/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class Diagram extends Layer{

    ArrayList<Layer> listLayers = new ArrayList<>();

    public int getsize(Layer layer){
        return layer.size();
    }


    Layer layer_circle = new Layer();
    Layer layer_rectangle = new Layer();
    Layer layer_triangle = new Layer();
    Layer layer_square = new Layer();
    Layer layer_hexagon = new Layer();
    public void tranfer() {
        for (int i = 0; i < listLayers.size(); i++) {
            for (int j = 0; j < getsize(listLayers.get(i)); j++) {
                if(listLayers.get(i).getelement(j) instanceof Circle){
                    layer_circle.add(listLayers.get(i).getelement(j) );
                }
                if(listLayers.get(i).getelement(j) instanceof Rectangle){
                    layer_rectangle.add(listLayers.get(i).getelement(j) );
                }
                if(listLayers.get(i).getelement(j) instanceof Square){
                    layer_square.add(listLayers.get(i).getelement(j) );
                }
                if(listLayers.get(i).getelement(j) instanceof Hexagon){
                    layer_hexagon.add(listLayers.get(i).getelement(j) );
                }
                if(listLayers.get(i).getelement(j) instanceof Triangle){
                    layer_triangle.add(listLayers.get(i).getelement(j) );
                }
            }
        }
    }
    
    
    
    
   
    public void delShape(){
        for(int i = 0; i< listLayers.size(); i++){
            listLayers.get(i).delShape_Rectangle();
        }
    }
    
    
}
    
    

