package oop_tuan6;
import java.util.ArrayList;
import java.util.List;

public class Diagram {
	protected List<Layer> listLayer;

    public Diagram() {
        this.listLayer = new ArrayList<>();
    }

    public void addLayer(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeAllCircle() {
        for (int i = 0; i < listLayer.size(); i++) {
            this.listLayer.get(i).removeAllCircle();
    	}
    }

    public void showAllLayer() {
        for (Layer layer : this.listLayer) {
            layer.showAllShapes();
        }
    }
}
