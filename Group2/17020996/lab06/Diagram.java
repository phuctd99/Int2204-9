import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCNE on 15/10/2018.
 */
public class Diagram {
    List<Layer> layers = new ArrayList<>();
    void reMoveCircle(){
        for(Layer i : layers){
            for (Shape j : i.shapes){
                 if (j instanceof circle){
                     i.shapes.remove(j);
                     break;
                 }
            }
        }
    }
}
