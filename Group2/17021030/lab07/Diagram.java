package lab07;

import java.util.ArrayList;

public class Diagram {
    private String name;
    private String dateModified;
    private ArrayList<Layer> arr_Layer = new ArrayList<Layer>();
    private int arr_Layer_size;

    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public ArrayList<Layer> getArr_Layer() {
        return arr_Layer;
    }

    public void setArr_Layer(ArrayList<Layer> arr_Layer) {
        this.arr_Layer = arr_Layer;
        this.arr_Layer_size = arr_Layer.size();
    }

    public int getArr_Layer_size() {
        return arr_Layer_size;
    }
    
    // constructor
    public Diagram(String name, String dateModified) {
        this.name = name;
        this.dateModified = dateModified;
    }
    
    public Diagram(ArrayList<Layer> arr_Layer) {
        this.arr_Layer = arr_Layer;
        this.arr_Layer_size = arr_Layer.size();
    }
    
    public Diagram() {
    }
    
    // them mot layer vao diagram
    public void add(Layer layer) {
        arr_Layer.add(layer);
        arr_Layer_size++;
    }
    
    public void add(int index, Layer layer) {
        arr_Layer.add(index, layer);
        arr_Layer_size++;
    }
  
    // xoa het cac Circle ra khoi Diagram
    public void removeAllCircles() {
       int size = arr_Layer.size();
       for (int i = 0; i < size; i++) {
           arr_Layer.get(i).removeCircle();
       }
    }
    
    // phuong thuc don tat ca, hinh nao vao layer hinh do 
    public void MoveToLayer() {
        Layer Circle_layer = new Layer();
        Layer Rectangle_layer = new Layer();
        Layer Square_layer = new Layer();
        Layer Triangle_layer = new Layer();
        int size_1 = arr_Layer.size();
        for (int i = 0; i < size_1; i++) {
            ArrayList<Shape> tmp_arr_shape = arr_Layer.get(i).getArr_Shape();
            int size_2 = tmp_arr_shape.size();
            for (int j = 0; j < size_2; j++) {
                if (tmp_arr_shape.get(j) instanceof Triangle) {
                    Triangle_layer.add(tmp_arr_shape.get(j));
                }
                else if (tmp_arr_shape.get(j) instanceof Rectangle) {
                    Rectangle_layer.add(tmp_arr_shape.get(j));
                }
                else if (tmp_arr_shape.get(j) instanceof Square) {
                    Square_layer.add(tmp_arr_shape.get(j));
                }
                else if (tmp_arr_shape.get(j) instanceof Circle) {
                    Circle_layer.add(tmp_arr_shape.get(j));
                }
            }
        }
        // xoa het cac layer cu
        for (int i = 0; i < size_1; i++) {
            arr_Layer.remove(0);
            arr_Layer_size--;
        }
        // add cac layer moi vua tao
        arr_Layer.add(Circle_layer);
        arr_Layer.add(Rectangle_layer);
        arr_Layer.add(Square_layer);
        arr_Layer.add(Triangle_layer);
    }

}
