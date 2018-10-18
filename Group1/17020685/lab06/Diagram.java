/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_6;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Diagram {
    
    
    ArrayList<Layer> listlayer = new ArrayList<>();
    
    public void input(int n) {
        for(int i = 0; i < n; i++) {
            Layer layer = new Layer();
            layer.input();
            listlayer.add(layer);
        }
    }
    
    public void output() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++)
                listlayer.get(i).getLayer().get(j).output();
        }
    }
    
    public void removeCircleDiagram() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++) {
                if (listlayer.get(i).getLayer().get(j) instanceof Circle)
                listlayer.get(i).getLayer().remove(j);
                
            }
        }
    }
    
    public static void main(String[] args) {
        Diagram di = new Diagram();
        di.input(1);
        di.removeCircleDiagram();
        di.output();
    }
}
