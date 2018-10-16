/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap06;

import java.util.ArrayList;

/**
 *
 * @author Hoang Vu Huong
 */
public class Layer {
    ArrayList<Shape> listShape = new ArrayList<>();
    //public ArrayList<Shape> shapes = new ArrayList<>();
    
    Shape circle1 = new Circle(0, 0, "RED", 1);
    Shape triangle1 = new Triangle(1, 1, "RED", 3, 4, 5);
    Shape triangle2 = new Triangle(1, 2, "YELLOW", 8, 6, 10);
    Shape rectangle = new Rectangle(3, 4, "navy", 5, 6);
    Shape square = new Square(4, 7, "BLUE", 6);
    Shape circle2 = new Circle(0, 1, "PINK", 2);
//    public void init(){
//        
//    }
    void init() {
        listShape.add(square);
        listShape.add(triangle2);
        listShape.add(circle2);
        listShape.add(rectangle);
        listShape.add(triangle1);
        listShape.add(circle1);
    }
    public void removeTriangle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
                i--;
            }
        }
    }
    
    public void removeCircle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Circle) {
                listShape.remove(i);
                i--;
            }
        }
    }
    
    public void output(){
        listShape.forEach((ele) -> {
            ele.output();
        });
    }

    
}
