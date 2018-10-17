import java.util.ArrayList;

public class Diagram {
    private Layer layer;
    public Diagram(Layer layer){
        this.layer = layer;
    }

    ArrayList<Layer> layers = new ArrayList<>();


    public void removeCircleInLayer(){
        for(int i =0;i<layers.size();i++){
            layers.get(i).removeCircle();
            i--;
        }
    }

    public void input(int n){
        for(int i =0;i<n;i++){
            Layer layer = new Layer();
            layer.nhap();
            layers.add(layer);
        }
    }
    public void cout (){
        for(int i =0;i< layers.size();i++){
            layers.get(i).in();
        }
    }

}
