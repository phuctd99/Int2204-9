/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap07;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Layer {
    protected ArrayList <Shape> shapes = new ArrayList<Shape>();
    public boolean isVisible;
    //String[] toList;

    
    public Layer() {
        this.isVisible = true;
    }
    
    public String[] toList() {
        String[] listShape = new String[shapes.size()];
        for(int i=0; i<listShape.length; i++){
            if(shapes.get(i) instanceof Rectangle) listShape[i] = "Rectangle";
            if(shapes.get(i) instanceof Triangle) listShape[i] = "Triangle";
            if(shapes.get(i) instanceof Square) listShape[i] = "Square";
            if(shapes.get(i) instanceof Circle) listShape[i] = "Circle";
            if(shapes.get(i) instanceof Hexagon) listShape[i] = "Hexagon";
        }
        return listShape;
    }
    
    public void deleteSameShape() {
        for(int i=0; i<shapes.size(); i++) {
            for(int j = i+1; j<shapes.size(); j++) {
                if(shapes.get(i).isSameShape(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
