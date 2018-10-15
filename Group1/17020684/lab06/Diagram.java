
package lab06;
import java.util.*;
/**
 *
 * @author Pc
 */
public class Diagram {
    Scanner Sc = new Scanner(System.in);
     public ArrayList<Layer> list = new ArrayList<>();
    
    public void input(int n) {
        for(int i = 0; i < n; i++) {
            Layer layer = new Layer();
            layer.inputtoado();
            list.add(layer);
        }
    }
    
    public void output() {
        for (int i = 0; i < list.size(); i++) {
                for(int j=0;j<list.get(i).getLayer().size();j++){
                    list.get(i).getLayer().get(j).outputtoado();
                }
        }
    }
    
    public void CircleDiagram() {
        for (int i = 0; i < list.size(); i++) {
             for(int j=0 ; j <list.get(i).getLayer().size() ; j++){
                 if(list.get(i).getLayer().get(j) instanceof Circle) {
                     list.get(i).getLayer().remove(j);
                     j--;
                 }
             }
        }
    }
}
