package Lab06;
import java.util.ArrayList;
import java.util.List;

public class Diagram {

    public List<Layer> Layers = new ArrayList<>();

    public void CircleRemove() {
        for (int i = Layers.size()-1; i >= 0 ; i--) {
           for (int j =0; j < Layers.get(i).Shapes.size() ; j++) {
               if (Layers.get(i).Shapes.get(j) instanceof Circle)
                   Layers.get(i).Shapes.remove(j);
            }
        }
    }
}
