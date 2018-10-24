import java.util.*;
import java.util.List;

public class Layer {

    public List<Shape> shapes = new ArrayList<>();
    public boolean isVisible;

    //constuctor
    public Layer() {
        isVisible = true;
    }

    //getter
    public String[] toList() {
        String[] result = new String[shapes.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = shapes.get(i).getClass().getName();
        }
        return result;
    }

    public void deleteDulicate() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
