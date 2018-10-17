import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Layer {
    public List<Shape> shapes = new ArrayList();

    //constructor
    public Layer() {
    }


    //function
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void printInfo() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
    }

    //remove all circle in layer
    public void removeCircle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    //remove all triangle in layer
    public void removeTriangle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
                i--;
            }
        }
    }
}
