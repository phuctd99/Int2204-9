/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Diagram {
    private ArrayList<Layer> layer = new ArrayList<>();

    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    
    public void delete (){
        for(int i = layer.size() - 1; i >= 0;i--){
            for(int j = 0; j < getLayer().get(i).getSha().size();j++)
            if(layer.get(i).getSha().get(j)instanceof Cicrle){
                layer.get(i).getSha().remove(j);
            }
        }
    }
}
