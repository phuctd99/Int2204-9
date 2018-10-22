package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Diagram {
    public List<Layer> layers = new ArrayList<Layer>();

    //constructor
    public Diagram() {
    }
    public Diagram(int number) {
        addLayer(number);
    }


    //function
    public void addLayer() {
        layers.add(new Layer());
    }
    public void addLayer(int number) {
        for (int i = 0; i < number; i++) {
            layers.add(new Layer());
        }
    }
    public int getLayersSize() {
        return layers.size();
    }
    public void addShape(int layerIndex, Shape shape) {
        layers.get(layerIndex).addShape(shape);
    }
    public void print() {
        for (int i = 0; i < layers.size(); i++) {
            System.out.println("Layer " + i);
            layers.get(i).printInfo();
        }
    }
    public void removeCircle() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeCircle();
        }
    }

    public void removeSquare() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeSquare();
        }
    }

    public void removeRectangle() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeRectangle();
        }
    }

    public void removeTriangle() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeTriangle();
        }
    }
    public void removeHexagon() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeHexagon();
        }
    }
}
