/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.ArrayList;

/**
 *
 * @author CACLV
 */
public class Layer {
    //Layer shapes = new Layer();
    
    public ArrayList<Shape> shapes = new ArrayList<>();
    
    Shape circle1 = new Circle(0, 0, "red", 1);
    Shape triangle1 = new Triangle(1, 1, "green", 3, 4, 5);
    Shape triangle2 = new Triangle(1, 2, "green", 8, 6, 10);
    Shape rectangle = new Rectangle(3, 4, "navy", 5, 6);
    Shape square = new Square(4, 7, "black", 6);
    Shape circle2 = new Circle(0, 1, "blue", 2);
    public void init(){
        shapes.add(square);
        shapes.add(triangle2);
        shapes.add(circle2);
        shapes.add(rectangle);
        shapes.add(triangle1);
        shapes.add(circle1);
    }
    
    public void removeTriangle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i); i--;
            }
        }
    }
    
    public void removeCircle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i); i--;
            }
        }
    }
    
    public void output(){
        shapes.forEach((ele) -> {
            ele.output();
        });
    }
    
}
