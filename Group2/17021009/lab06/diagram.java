package Tuan6;

import java.util.ArrayList;
public class diagram {
    private int width = 300;
    private int height = 300;

    public diagram() {}

    public diagram(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private ArrayList<layer> listLayer = new ArrayList<>();

    public ArrayList<layer> getListLayer() {
        return listLayer;
    }

    public void setListLayer(ArrayList<layer> listLayer) {
        this.listLayer = listLayer;
    }

    public void removeAllCircle() {
        int sizeListLayer = listLayer.size();
        for (int i = 0; i < sizeListLayer; i++) {
            for (int j = listLayer.get(i).getListShape().size()-1; j >= 0; j--) {
                if (listLayer.get(i).getListShape().get(j) instanceof circle)
                    listLayer.get(i).getListShape().remove(j);
            }
        }
        System.out.println("Xóa thành công");
    }
}
