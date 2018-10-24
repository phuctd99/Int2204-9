/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OppLab7;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Layer {
    private boolean visible;
    public ArrayList<Shape> shapes;
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public boolean getVisible () {
        return visible;
    }
    public void clearShape() {
        for(int i = 0; i < shapes.size(); i++) {

            for(int j = i+1; j < shapes.size(); j++){
                if(shapes.get(i) == shapes.get(j)) {
                    shapes.remove(j);

                }
            }
        }
    }
    public void addLayer(Shape shape) {
        if(shapes.isEmpty()) {
            shapes.add(shape);
        }
        else {
            if(shape instanceof Circle && shapes.get(0) instanceof Circle) {
                shapes.add(shape);
            }
            else {
                if(shape instanceof Triangle && shapes.get(0) instanceof Triangle) {
                    shapes.add(shape);
                }
                else {
                    if(shape instanceof Rectangle && shapes.get(0) instanceof Rectangle) {
                        shapes.add(shape);
                    }
                    else {
                        if(shape instanceof Square && shapes.get(0) instanceof Square) {
                            shapes.add(shape);
                        }
                        else {
                            if(shape instanceof Hexagon && shapes.get(0) instanceof Hexagon) {
                                shapes.add(shape);
                            }
                        }
                    }
                }
            }
        }
    }
}
