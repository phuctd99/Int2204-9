package Tuan7;

import java.util.ArrayList;

public class layer {
    //tạo một arrlist kiểu shape
    private ArrayList<shape> listShape = new  ArrayList<>();

    public ArrayList<shape> getListShape() {
        return listShape;
    }

    public void setListShape(ArrayList<shape> listShape) {
        this.listShape = listShape;
    }

    //xóa tất cả các hihf là hình tam giác
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
