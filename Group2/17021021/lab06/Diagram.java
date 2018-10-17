import java.util.ArrayList;
import java.util.List;

public class Diagram {
    public List<Layer> layers = new ArrayList();

    //constructor
    public Diagram() {
    }
    public Diagram(int number) {
        addLayer(number);
    }


    //function
    //create new layer
    public void addLayer() {
        layers.add(new Layer());
    }

    //create new layers
    public void addLayer(int number) {
        for (int i = 0; i < number; i++) {
            layers.add(new Layer());
        }
    }

    //get number of layers
    public int getLayersSize() {
        return layers.size();
    }

    //add shape in specific layer
    public void addShape(int layerIndex, Shape shape) {
        layers.get(layerIndex).addShape(shape);
    }

    //print info about diagram
    public void printInfo() {
        System.out.println("---------------------------------------");
        for (int i = 0; i < layers.size(); i++) {
            System.out.println("Layer " + i);
            layers.get(i).printInfo();
        }
        System.out.println("---------------------------------------");
    }

    //remove all circle in diagram
    public void removeCircle() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeCircle();
        }
    }

    //remove all triangle in diagram
    public void removeTriangle() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeTriangle();
        }
    }
}