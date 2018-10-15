/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Layer {
    private ArrayList<Shape> listShape = new  ArrayList<>();
    public ArrayList<Shape> getListShape() {
        return listShape;
    }

    public void setListShape(ArrayList<Shape> listShape) {
        this.listShape = listShape;
    }

    public void removeAllTriangle() {
        int sizeListShape = listShape.size();
        for (int i = 0; i < sizeListShape; i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
            }
            i--;
        }
        System.out.println("deleted");
    }
}
