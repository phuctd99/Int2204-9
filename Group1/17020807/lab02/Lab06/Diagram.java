import java.util.ArrayList;
import java.util.List;

public class Diagram {

    private List<Layer> Layers = new ArrayList<>();

    public void CircleRemove() {
        for (int i = Layers.size(); i >= 0 ; i--) {
            if (Layers.get(i) instanceof Circle) {
                Layers.remove(i);
            }
        }
    }
}
