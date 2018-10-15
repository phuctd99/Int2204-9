package lab06;

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
}
