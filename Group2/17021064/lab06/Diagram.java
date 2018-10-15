import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layerArrayList = new ArrayList<>();

    public ArrayList<Layer> getLayerArrayList() {
        return layerArrayList;
    }

    public void setLayerArrayList(ArrayList<Layer> layerArrayList) {
        this.layerArrayList = layerArrayList;
    }

    public void delete (){
        for(int i = layerArrayList.size() - 1; i >= 0;i--){
            for(int j = 0; j < getLayerArrayList().get(i).getShapeArrayList().size();j++)
                if(layerArrayList.get(i).getShapeArrayList().get(j)instanceof Circle){
                    layerArrayList.get(i).getShapeArrayList().remove(j);
                }
        }
    }
}