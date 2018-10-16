import java.util.ArrayList;

public class Layer {
    protected ArrayList <Shape> shapes = new ArrayList<Shape>();

    public Layer() {}

    public Layer(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void removeTriangle () {
        for(int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    public void print () {
        for(Shape element : shapes) {
            System.out.println(element.toString());
        }
    }
}
