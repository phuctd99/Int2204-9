package bttuan7;

import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> listShape = new  ArrayList<>();
    private ArrayList<Circle> listCircle = new ArrayList<>();
    private ArrayList<Triangle> listTriangle = new ArrayList<>();
    private ArrayList<Rectangle> listRectangle = new ArrayList<>();
    private ArrayList<Square> listSquare = new ArrayList<>();
    private boolean visible ;

    public ArrayList<Shape> getListShape() {
        return listShape;
    }

    public void setListShape(ArrayList<Shape> listShape) {
        this.listShape = listShape;
    }
    
    public ArrayList<Circle> getListCircle() {
        return listCircle;
    }

    public void setListTriangle(ArrayList<Triangle> listTriangles) {
        this.listTriangle = listTriangles;
    }
    
    public ArrayList<Triangle> getListTriangle() {
        return listTriangle;
    }

    public void setListRectangle(ArrayList<Rectangle> listRectangle) {
        this.listRectangle = listRectangle;
    }
    public ArrayList<Rectangle> getRectangle() {
        return listRectangle;
    }
    
//    public  void setListRectangle(ArrayList<Rectangle> listRectangle) {
//        this.listRectangle =  listRectangle;
//    }
    
    public ArrayList<Square> getListSquare() {
        return listSquare;
    }

    public void setListSquare(ArrayList<Square> listSquare) {
        this.listSquare = listSquare;
    }
    
    
    public void removeAllTriangle() {
        int sizeListShape = listShape.size();
        for (int i = 0; i < sizeListShape; i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
            }
        }
        System.out.println("Xóa thành công");
    }
    
    public void deleteCirde () {
        int size = listCircle.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (listCircle.get(i).getCenter().getX() == listCircle.get(j).getCenter().getX() &&
                listCircle.get(i).getCenter().getY() == listCircle.get(j).getCenter().getY() &&
                listCircle.get(i).getRadius() == listCircle.get(j).getRadius()) {
                listCircle.remove(j);
                }
            }
        }
    }
    
    public void deleteTriangle() {
        int size = listTriangle.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (listTriangle.get(i).getP1().getX() == listTriangle.get(j).getP1().getX() && 
                listTriangle.get(i).getP1().getY() == listTriangle.get(j).getP1().getY() &&
                listTriangle.get(i).getP2().getX() == listTriangle.get(j).getP2().getX() &&
                listTriangle.get(i).getP2().getY() == listTriangle.get(j).getP2().getY() &&
                listTriangle.get(i).getP3().getX() == listTriangle.get(j).getP3().getX() &&
                listTriangle.get(i).getP3().getY() == listTriangle.get(j).getP3().getY()) {
                listTriangle.remove(j);
                }
            }
        }
    }
    
    public void deleteRectangle() {
        int size = listRectangle.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (listRectangle.get(i).getTop_left().getX() == listRectangle.get(j).getTop_left().getX() &&
                    listRectangle.get(i).getTop_left().getY() == listRectangle.get(j).getTop_left().getY() &&
                    listRectangle.get(i).getBot_right().getX() == listRectangle.get(j).getBot_right().getX() &&
                    listRectangle.get(i).getBot_right().getY() == listRectangle.get(j).getBot_right().getY()) {
                    listRectangle.remove(j);
                }
            }
        }
    }
    
    public void deleteSquare() {
        int size = listSquare.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (listSquare.get(i).getTop_left().getX() == listSquare.get(j).getTop_left().getX() &&
                    listSquare.get(i).getTop_left().getY() == listSquare.get(j).getTop_left().getY() &&
                    listSquare.get(i).getBot_right().getX() == listSquare.get(j).getBot_right().getX() &&
                    listSquare.get(i).getBot_right().getY() == listSquare.get(j).getBot_right().getY()) {
                    listRectangle.remove(j);
                }
            }
        }
    }
}