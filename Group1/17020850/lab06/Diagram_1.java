
package lab06;
import java.util.*;
/**
 *
 * @author Pc
 */
public class Diagram_1 {
    
    ArrayList<Layer> listlayer = new ArrayList<>();
    
    public void input(int n) {
        for(int i = 0; i < n; i++) {
            Layer layer = new Layer();
            layer.input();
            listlayer.add(layer);
        }
    }
    
    public void output() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++) {
                listlayer.get(i).getLayer().get(j).output();
            }
           
        }
    }
    
    public void removeCircleDiagram() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++) {
                if (listlayer.get(i).getLayer().get(j) instanceof Circle) {
                    listlayer.get(i).getLayer().remove(j);
                }
            }   
        }
    }
}
