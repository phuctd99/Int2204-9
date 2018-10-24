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
    private ArrayList<Layer> listLayer = new ArrayList<>();
    Layer lCircle = new Layer();
    Layer lRectangle = new Layer();
    Layer lSquare = new Layer();
    Layer lTriangle = new Layer();
    Layer lHexagon = new Layer();

    public ArrayList<Layer> getLayer() {
        return listLayer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.listLayer = layer;
    }
    
    public void deleteCicrle (){
        for(int i = listLayer.size() - 1; i >= 0;i--){
            for(int j = 0; j < getLayer().get(i).getSha().size();j++)
            if(listLayer.get(i).getSha().get(j)instanceof Cicrle){
                listLayer.get(i).getSha().remove(j);
            }
        }
    }
    public void sort(){

        for(int i = 0; i < listLayer.size(); i++){
            for(int j = 0; j < listLayer.get(i).layer.size(); j++){
                if(listLayer.get(i).layer.get(i) instanceof Cicrle){
                    lCircle.layer.add(listLayer.get(i).layer.get(i));
                }else if(listLayer.get(i).layer.get(i) instanceof Rectangle){
                    lRectangle.layer.add(listLayer.get(i).layer.get(i));
                }else if(listLayer.get(i).layer.get(i) instanceof Square){
                    lSquare.layer.add(listLayer.get(i).layer.get(i));
                }else if(listLayer.get(i).layer.get(i) instanceof Triangle){
                    lTriangle.layer.add(listLayer.get(i).layer.get(i));
                }else if(listLayer.get(i).layer.get(i) instanceof Hexagon){
                    lHexagon.layer.add(listLayer.get(i).layer.get(i));
                }
            }
        }
    }
}
