/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttuan7;

import java.util.ArrayList;

/**
 *
 * @author Nguyen
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new Point(10,10), 1);
        Shape rectangle = new Rectangle(new Point(20, 20), new Point(50,20), new Point(20, 0), new Point(50, 0));
        Shape square = new Square(new Point(60,60), new Point(70,60), new Point(60, 50), new Point(70, 50));
        Shape triangle = new Triangle(new Point(100,100), new Point(100,200), new Point(200,250));
        Diagram diagram = new Diagram();
        ArrayList<Layer> listLayer = new ArrayList<>();
        diagram.setListLayer(listLayer);
        Layer layer = new Layer();
        ArrayList<Shape> listShape = new ArrayList<>();
        listShape.add(circle);
        listShape.add(rectangle);
        listShape.add(square);
        listShape.add(triangle);
        layer.setListShape(listShape);
        listLayer.add(layer);
        diagram.removeAllCircle();
        diagram.getListLayer().get(0).removeAllTriangle();
        System.out.println(listShape.size());
    }
}
