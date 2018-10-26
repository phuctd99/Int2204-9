package bttuan7;

import java.util.ArrayList;

public class Diagram {

    private ArrayList<Layer> listLayer = new ArrayList<>();
    private ArrayList<Shape> listCircle = new ArrayList<>();
    private ArrayList<Shape> listTriangle = new ArrayList<>();
    private ArrayList<Shape> listRectangle = new ArrayList<>();
    private ArrayList<Shape> listSquare = new ArrayList<>();

    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    public void setListLayer(ArrayList<Layer> listLayer) {
        this.listLayer = listLayer;
    }

    public ArrayList<Shape> getListCỉrcle() {
        return listCircle;
    }

    public void setListCircle(ArrayList<Shape> listCircle) {
        this.listCircle = listCircle;
    }
    public ArrayList<Shape> getListTriangle() {
        return listTriangle;
    }

    public void setListTriangle(ArrayList<Shape> listTriangle) {
        this.listTriangle = listTriangle;
    }
    public ArrayList<Shape> getListRectangle() {
        return listRectangle;
    }

    public void setListRectangle(ArrayList<Shape> listRectangle) {
        this.listRectangle = listRectangle;
    }
    public ArrayList<Shape> getListSquare() {
        return listSquare;
    }

    public void setListSquare(ArrayList<Shape> listSquare) {
        this.listSquare = listSquare;
    }
    public void removeAllCircle() {
        int sizeListLayer = listLayer.size();
        for (int i = 0; i < sizeListLayer; i++) {
            for (int j = 0; j < listLayer.get(i).getListShape().size(); j++) {
                if (listLayer.get(i).getListShape().get(j) instanceof Circle)
                    listLayer.get(i).getListShape().remove(j);
            }
        }
        System.out.println("Xóa thành công");
    }
    
    public void moveInLayer () {
        int sizeListLayer = listLayer.size();
        for (int i = 0; i < sizeListLayer; i++) {
            for (int j = 0; j < listLayer.get(i).getListShape().size(); j++) {
                if (listLayer.get(i).getListShape().get(j) instanceof Circle) {
                    listCircle.add(listLayer.get(i).getListShape().get(j));
                } else if (listLayer.get(i).getListShape().get(j) instanceof Triangle) {
                    listTriangle.add(listLayer.get(i).getListShape().get(j));
                } else if (listLayer.get(i).getListShape().get(j) instanceof Rectangle) {
                    listRectangle.add(listLayer.get(i).getListShape().get(j));
                } else {
                    listSquare.add(listLayer.get(i).getListShape().get(j));
                }
            }
        }
    }
}
