package lab07;

import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> arr_Shape = new ArrayList<Shape>();
    private int arr_Shape_size = 0;
    private boolean visible = true;
    // setter & setter
    public void setArr_Shape(ArrayList<Shape> arr_Shape) {
        this.arr_Shape = arr_Shape;
    }
    
    public ArrayList<Shape> getArr_Shape() {
        return arr_Shape;
    }

    public int getArr_Shape_size() {
        return arr_Shape_size;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    
    // constructor
    public Layer(ArrayList<Shape> arr_Shape) {
        this.arr_Shape = arr_Shape;
        this.arr_Shape_size = arr_Shape.size();
    }

    public Layer() {
    }
    
    // them shape vao layer
    public void add(Shape shape) {
        arr_Shape.add(shape);
        arr_Shape_size++;
    }
    
    public void add(int index, Shape shape) {
        arr_Shape.add(index, shape);
        arr_Shape_size++;
    }
    
    // xoa cac doi tuong Circle ra khoi mot layer
    public void removeCircle() {
        int size = arr_Shape.size();
        for (int i = 0; i < size; i++) {
            if (i >= arr_Shape_size) {
                break;
            } // co cai nay de de phong OutBoundException
            if ( arr_Shape.get(i) instanceof Circle) {
                arr_Shape.remove(i);
                arr_Shape_size--;
                i--;
            }
        } 
    }
    
    // xoa cac doi tuong Triangle ra khoi mot layer
    public void removeTriangle() {
        int Layer_size = arr_Shape.size();
        for (int i = 0; i < Layer_size; i++) {
            if (i >= arr_Shape_size) {
                break;
            } // co cai nay de de phong OutBoundException
            if (arr_Shape.get(i) instanceof Triangle) {
                arr_Shape.remove(i);
                arr_Shape_size--;
                i--;
            }
        }
    }
    
    // xoa cac doi tuong trung nhau trong Layer
    public void removeDuplicate() {
        int Layer_size = arr_Shape.size();
        for (int i = 0; i < Layer_size - 1; i++) {
            if (i >= arr_Shape_size) {
                break;
            }
            for (int j = i + 1; j < Layer_size; j++) {
                if (j >= arr_Shape_size) {
                    break;
                }
                if (arr_Shape.get(i).isTheSame(arr_Shape.get(j))) {
                    arr_Shape.remove(j);
                    j--;
                    arr_Shape_size--;
                }
            }
        }
    }
}

