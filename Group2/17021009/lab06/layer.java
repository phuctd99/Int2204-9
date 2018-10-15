package Tuan6;

import java.util.ArrayList;

public class layer {
    private ArrayList<shape> listShape = new  ArrayList<>();

    public ArrayList<shape> getListShape() {
        return listShape;
    }

    public void setListShape(ArrayList<shape> listShape) {
        this.listShape = listShape;
    }

    public void removeAllTriangle() {
        int sizeListShape = listShape.size();
        for (int i = sizeListShape-1; i >= 0; i--) {
            if (listShape.get(i) instanceof triangle) {
                listShape.remove(i);
            }
        }
        System.out.println("Xóa thành công");
    }
}
