import java.util.ArrayList;

public class Diagram {
    protected Layer layer = new Layer();
   // ArrayList<Layer> layers = new ArrayList<>();

    public Diagram(Layer layer) {
        this.layer = layer;
    }

    public void removeCircle() {
        for(int i = layer.shapes.size()-1; i >= 0 ; i--) {
            if (layer.shapes.get(i) instanceof Circle) {
                layer.shapes.remove(i);
            }
        }
    }

    public void print () {
        layer.print();
    }
}
