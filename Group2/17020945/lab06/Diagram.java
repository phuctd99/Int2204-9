import java.util.ArrayList;

public class Diagram {
	ArrayList<Layer> layers = new ArrayList<>();

	public ArrayList<Layer> removeCircle (ArrayList<Layer> layers){
		for(int i = 0; i < layers.size(); i++){
			layers.get(i).removeCircle();
		}
		return layers;
	}
}