package lab06;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Layer {
    private boolean visible;

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
    private ArrayList<Shape> listShape = new  ArrayList<>();
    public ArrayList<Shape> getListShape() {
        return listShape;
    }

    public void setListShape(ArrayList<Shape> listShape) {
        this.listShape = listShape;
    }

    public void removeAllTriangle() {
        int sizeListShape = listShape.size();
        for (int i = 0; i < sizeListShape; i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
            }
            i--;
        }
        System.out.println("deleted");
    }
}