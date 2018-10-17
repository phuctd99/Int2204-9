import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Layer {
    List<Shape> obj = new ArrayList<>();
    public Layer(){

    }
    public Layer(List<Shape> obj) {
        this.obj = obj;
    }
    public void addShape(Shape shape){
        obj.add(shape);
    }
    public void removeTriangle(){
        for( int i =0; i < obj.size(); i++){
            if(obj.get(i) instanceof Triangle){
                obj.remove(i);
                i --;
            }
        }
    }
}



