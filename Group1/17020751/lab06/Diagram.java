/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan6;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Diagram {
    private ArrayList<Layer> listLayer = new ArrayList<Layer>();

    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    public void setListLayer(ArrayList<Layer> listLayer) {
        this.listLayer = listLayer;
    }
    public void removeAllCircle() {
        for (int i = 0; i < listLayer.size(); i++) {
            for (int j = 0; j < listLayer.get(i).getListShape().size(); j++) {
                if (listLayer.get(i).getListShape().get(j) instanceof Circle)
                    listLayer.get(i).getListShape().remove(j);
            }
        }
    }
}
