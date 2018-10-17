
import java.util.ArrayList;

public class Layer {
    public ArrayList<Shape> Shapes = new ArrayList<Shape>();

    public ArrayList<Shape> getShapes() {
        return Shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        Shapes = shapes;
    }

    public void removeRectangle(){
        int n = Shapes.size();
        for (int i = n; i >= 0; i--){
            if (Shapes.get(i) instanceof Rectangle){
                Shapes.remove(i);
            }
        }
    }

}
