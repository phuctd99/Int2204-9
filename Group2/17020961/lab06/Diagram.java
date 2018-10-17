/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Diagram {
    private int dai;
    private int rong;
    public Diagram() {}

    public Diagram(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }
    private ArrayList<Layer> listLayer = new ArrayList<>();
    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    public void setListLayer(ArrayList<Layer> listLayer) {
        this.listLayer = listLayer;
    }

    public void removeAllCircle() {
        int sizeListLayer = listLayer.size();
        for (int i = 0; i < sizeListLayer; i++) {
            for (int j = 0; j < listLayer.get(i).getListShape().size(); j++) {
                if (listLayer.get(i).getListShape().get(j) instanceof Circle)
                    listLayer.get(i).getListShape().remove(j);
                j--;
            }
        }
        System.out.println("deleted");
    }
}
