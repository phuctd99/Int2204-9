/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Layer {

    ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public Layer() {
    }
    // Delete Triangle in Layer
    public void removeTriangle() {
        int i = 0;
        while (i < shapes.size()) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Deleted Triangle !");
    }

}
