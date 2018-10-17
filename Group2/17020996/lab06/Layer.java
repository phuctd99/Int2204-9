import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCNE on 15/10/2018.
 */
public class Layer {
    List<Shape> shapes = new ArrayList<>();
    void reMoveTriangle(){
        for(Shape i : shapes){
            if (i instanceof triangle){
                shapes.remove(i); break;
            }
        }
    }
}
