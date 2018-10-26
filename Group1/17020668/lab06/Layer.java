package test05;

import java.util.ArrayList;

public class Layer extends Shape {
    protected ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape s, int i){ //thêm hình vào
        shapes.add(i, s);
    }

    public void deleteShape(int i){ //xóa hình
        shapes.remove(i);
    }

    public void deleteTriangle(){//xóa triangle
        for (int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) instanceof Trialgle){
                shapes.remove(i);
                i --;
            }
        }
    }

    public void deleteCircle(){// xóa circle
        for (int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) instanceof Circle){
                shapes.remove(i);
                i --;
            }
        }
    }
}
