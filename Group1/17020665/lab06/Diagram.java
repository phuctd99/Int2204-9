
import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> Layers = new ArrayList<Layer>();

    public ArrayList<Layer> getLayers() {
        return Layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        Layers = layers;
    }

    public void removeCircle(){
        int n = Layers.size();
        for (int i = n - 1; i >= 0; i--){
            if (Layers.get(i) instanceof Circle){
                Layers.remove(i);
            }
        }
    }


}
