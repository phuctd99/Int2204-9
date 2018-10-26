
package lab06;

import java.util.*;

public class Layer {
    public ArrayList<Shape> layer = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }

    
    public void removeTriangle() {
        for (int i = layer.size()-1; i >=0; i--) {
            if (getLayer().get(i) instanceof Triangle) {
                getLayer().remove(i);
            }
        }
    }

}