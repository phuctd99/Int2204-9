package Lab06;

import java.util.ArrayList;
import java.util.List;

public class Layer extends Diagram{
    
    boolean visible;

    public List<Shape> Shapes = new ArrayList<>();

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void TriangleRemove() {
        for (int i = Shapes.size() - 1; i >= 0; i--) {
            if (Shapes.get(i) instanceof Rectangle) {
                Shapes.remove(i);
            }
        }
    }
    public void DeleteSame() {
        for (int i = Shapes.size() - 1; i >= 0; i--) {
            for (int j = Shapes.size() - 2; j > i; j--) {
               if (Shapes.get(i) instanceof Rectangle && Shapes.get(j) instanceof Rectangle && 
                        Shapes.get(i).getX() == Shapes.get(j).getX() && Shapes.get(i).getY() == Shapes.get(j).getY() && 
                        Shapes.get(i).getLength()==Shapes.get(j).getLength()) {
                        Shapes.remove(i);
              
          

            }
        }
    }
    
}
