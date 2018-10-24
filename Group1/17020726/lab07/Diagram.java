import java.util.ArrayList;

public class Diagram {
    private String title = "Title";
    private ArrayList<Layer> listLayers = new ArrayList<Layer>();
    //Constructor
    public Diagram(){

    }
    public Diagram(String title) {
        this.title = title;
    }

    //setter, getter
    public String getTitle() {
        return title;
    }

    public ArrayList<Layer> getListLayers() {
        return listLayers;
    }

    public void setListLayers(ArrayList<Layer> listLayers) {
        this.listLayers = listLayers;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Them Layer
    public void addLayer(Layer layer) {
        listLayers.add(layer);
    }

    public void removeCircle() {
        for (Layer layer : listLayers) {
            layer.removeCircle();
        }
    }

    //tach hinh ve ve tung layer
    public void formatLayer() {
        ArrayList<Layer> Layer = new ArrayList<Layer>();
        for (Layer layer : listLayers) {
            for (Shape shape : layer.getList()) {
                if (Layer.size() == 0) {
                    Layer temp = new Layer();
                    temp.add(shape);
                    Layer.add(temp);
                    continue;
                }
                for (int i = 0; i < Layer.size(); i++) {
                    if(Layer.get(i).getList().get(0).isSameType(shape)) {
                        Layer.get(i).add(shape);
                        break;
                    }
                    if (i == Layer.size()-1) {
                        Layer temp = new Layer();
                        temp.add(shape);
                        Layer.add(temp);
                        break;
                    }
                }
            }
        }
        setListLayers(Layer);
    }

    @Override
    public String toString() {
        String s = "" + title + "\n";
        for (Layer layer : listLayers) {
            if (layer.isVisible()) {
                s += layer.toString();
            }
        }
        return s;
    }
}
