import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Diagram extends JFrame{
    ArrayList<Layer> layer = new ArrayList<>();
    public ArrayList<Layer> getLayers() {
        return layer;
    }
    public void setLayers(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    public ArrayList<Layer> remoCircle (ArrayList<Layer> layer){
        for(int i = 0; i < layer.size(); i++){
                layer.get(i).removeCircle();
        }
        return layer;
    };
     // Chuyển tất cả hình tròn vào 1 layer
    public void circleToLayer(ArrayList<Shape> listShapes) {
        
        for (int i = 0; i < layer.size(); i++) {
 
            for (int j = 0; j < layer.get(i).shape.size(); j++) {
                if (layer.get(i).shape.get(j) instanceof Circle) {
            
                    listShapes.add(layer.get(i).shape.get(j));
                }
            }
        }
        for (int i = 0; i < layer.size(); i++) {
            for (int j = 0; j < layer.get(i).shape.size(); j++) {
               
                if (layer.get(i).shape.get(j) instanceof Circle) {
                    layer.get(i).shape.remove(j);
                    j--;
                }
            }
        }
    }

    
}
