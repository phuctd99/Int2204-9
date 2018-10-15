/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(new ToaDo(10,10), 1);
        Shape rectangle = new Rectangle(new ToaDo(20, 20), new ToaDo(50,55));
        Shape square = new Square(new ToaDo(60,60), new ToaDo(70,70));
        Shape triangle = new Triangle(new ToaDo(100,100), new ToaDo(100,200), new ToaDo(200,250));
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