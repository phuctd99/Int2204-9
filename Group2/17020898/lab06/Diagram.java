import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Diagram {
    Layer a = new Layer();

    public Diagram(Layer a) {
        this.a = a;
    }
    public void removeCircle(){
        for( int i =0; i < a.obj.size(); i++){
            if(a.obj.get(i) instanceof Circle){
                a.obj.remove(i);
                i --;
            }
        }
    }
}