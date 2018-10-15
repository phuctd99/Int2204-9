import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> layer = new ArrayList<>();

    public ArrayList<Layer> remoCircle (ArrayList<Layer> layer){
        for(int i = 0; i < layer.size(); i++){
                layer.get(i).removeCircle();
        }
        return layer;
    };
}
