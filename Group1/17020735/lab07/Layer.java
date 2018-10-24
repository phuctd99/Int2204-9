import java.util.ArrayList;

public class Layer {
    private boolean visible = true;
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    private ArrayList<Shape> listShape = new ArrayList<>();

    public ArrayList<Shape> getListShape() {
        return listShape;
    }

    public void setListShape(ArrayList<Shape> listShape) {
        this.listShape = listShape;
    }

    public void addShape(Shape shape) {
        listShape.add(shape);
    }
}
