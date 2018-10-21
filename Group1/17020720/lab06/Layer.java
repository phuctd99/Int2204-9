/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Layer {

    private ArrayList<Shape> shapes;

    public Layer() {
        this.shapes = new ArrayList<>();

    }

    public Layer(ArrayList<Shape> shapes) {
        this.shapes = shapes;

    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void deletetriangle() {
        for (int i = 0; i < this.shapes.size(); i++) {
             {
                if (this.shapes.get(i) instanceof Triangle) {
                    System.out.println("Deleted " + this.shapes.get(i).toString());
                    this.shapes.remove(i);
                    i--;
                }
            }
        }     
    }
    public void deletecircle() {
        for (int i = 0; i < this.shapes.size(); i++) {
             {
                if (this.shapes.get(i) instanceof Circle) {
                    System.out.println("Deleted " + this.shapes.get(i).toString());
                    this.shapes.remove(i);
                    i--;
                }
            }
        }     
    }
}
