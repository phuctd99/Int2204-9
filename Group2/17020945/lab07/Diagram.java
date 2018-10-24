import java.util.ArrayList;
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
    
    //them hinh vuong vao layer
    public void circleToLayer(ArrayList<Shape> listShapes) {
        
        for (int i = 0; i < layer.size(); i++) {
            for (int j = 0; j < layer.get(i).shape.size(); j++) {
                if (layer.get(i).shape.get(j) instanceof Square) {
            
                    listShapes.add(layer.get(i).shape.get(j));
                }
            }
        }
    }
}