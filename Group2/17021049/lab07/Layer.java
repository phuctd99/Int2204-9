package lab7;

import java.util.ArrayList;

public class Layer {
    protected ArrayList<Shape> listShape = new ArrayList<>();
    protected boolean  visible;

    public Layer() {
        this.listShape = new ArrayList<>();
        this.visible = true;
    }

    public void setListShape(ArrayList<Shape> listShape) {
        this.listShape = listShape;
    }

    public ArrayList<Shape> getListShape() {
        return listShape;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void eraseAllTriangle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
            }
        }
        System.out.println("Ban da xoa thanh cong");
    }

}
