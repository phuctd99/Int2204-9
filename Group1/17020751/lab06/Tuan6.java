/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan6;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Tuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape sq = new Square(3);
        Shape triangle = new Triangle();
        ArrayList<Shape> listShape = new ArrayList<>();
        Layer la = new Layer();
        la.setListShape(listShape);
        listShape.add(sq);
        listShape.add(circle);
        listShape.add(rectangle);
        listShape.add(triangle);
        ArrayList<Layer> listLayer = new ArrayList<>();
        listLayer.add(la);
        Diagram diagram = new Diagram();
        diagram.setListLayer(listLayer);
        diagram.removeAllCircle();
    }
    
}
