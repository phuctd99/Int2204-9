/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class Diagram {

    private ArrayList<Layer> layers = new ArrayList<>();

    public Diagram() {
    }

    public Diagram(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public void deletecirle() {
        for (int i = 0; i < this.layers.size(); i++) {
            this.layers.get(i).deletecircle();

        }
    }

}
