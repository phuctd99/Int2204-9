package lab6;

import java.util.ArrayList;

class Diagram {
    protected ArrayList<Layer> listLayer = new ArrayList<Layer>();
    private int width = 250;
    private int length = 250;

    public Diagram(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Diagram() {
    }

    public void setListLayer(ArrayList<Layer> listLayer) {
        this.listLayer = listLayer;
    }

    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    public void eraseAllCircle(){
        for (int i=0; i<listLayer.size(); i++){
            for (int j=0; j<listLayer.get(i).listShape.size(); j++){
                if(listLayer.get(i).listShape.get(j) instanceof Circle){
                    listLayer.get(i).listShape.remove(j);
                }
            }
        }
        System.out.println("Ban da xoa thanh cong");
    }

}
