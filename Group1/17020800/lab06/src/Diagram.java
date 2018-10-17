import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> listlayer = new ArrayList<Layer>();

    public ArrayList<Layer> remoCircle (ArrayList<Layer> dia){
        for(int i = 0; i < dia.size(); i++){
            listlayer.get(i).removeCircle();
        }
        return dia;
    }
}
