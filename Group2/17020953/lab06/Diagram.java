/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Diagram {
    private ArrayList<Layer> layerArrayList = new ArrayList<>();

    public ArrayList<Layer> getLayerArrayList() {
        return layerArrayList;
    }

    public void setLayerArrayList(ArrayList<Layer> layerArrayList) {
        this.layerArrayList = layerArrayList;
    }

    public void delete (){
        for(int i = layerArrayList.size() - 1; i >= 0;i--){
            for(int j = 0; j < getLayerArrayList().get(i).getShapeArrayList().size();j++)
                if(layerArrayList.get(i).getShapeArrayList().get(j)instanceof Circle){
                    layerArrayList.get(i).getShapeArrayList().remove(j);
                }
        }
    }
}
