/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Diagram {
    ArrayList<Layer> listLayers = new ArrayList<>();

    public Diagram() {
        Layer layer = new Layer();
        layer.addLayer();
        listLayers.add(layer);
    }
    
   
    public void delShape(){
        for(int i = 0; i< listLayers.size(); i++){
            listLayers.get(i).delShape_Rectangle();
        }
    }
    
    
    
}
