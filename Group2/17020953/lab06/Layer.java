/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Layer {
    private ArrayList<Shape> shapeArrayList = new ArrayList<>();

    public ArrayList<Shape> getShapeArrayList() {
        return shapeArrayList;
    }

    public void setShapeArrayList(ArrayList<Shape> shapeArrayList) {
        this.shapeArrayList = shapeArrayList;
    }

    public void delete() {
        for(int i= getShapeArrayList().size() -1 ; i >=0;i--){
            if(getShapeArrayList().get(i) instanceof Triangle ){
                getShapeArrayList().remove(i);
            }
        }
    }
}