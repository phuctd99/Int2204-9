package test05;

import java.util.ArrayList;

public class Diagram extends Layer{
    protected ArrayList<Layer> layers = new ArrayList<Layer>();

    public ArrayList<Layer> getLayers(Shape a){
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public void addLayer(Layer a, int i){//thêm layer
        layers.add(i, a);
    }

    public void removeLayer(int i){//xóa layer
        layers.remove(i);
    }

    public void deleteCircles(){// xóa circle
        for(int i = 0; i < layers.size(); i ++){
            layers.get(i).deleteCircle();
        }
    }
}
