import java.util.ArrayList;
import java.util.List;

public class Layer {

    private List<Shape> Shapes = new ArrayList<>();

    public void TriangleRemove() {
        for (int i = Shapes.size() - 1; i >= 0; i--) {
            if (Shapes.get(i) instanceof Rectangle) {
                Shapes.remove(i);
            }
        }
    }
}
