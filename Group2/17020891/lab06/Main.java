package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shape retangle = new Retangle(40, 50);
        Shape triangle = new Triangle();
        Shape triangle1 = new Triangle(10, 10, "Red", 15, 20);
        Shape circle = new Circle(5);
        Shape square = new Square(20);
        Shape triangle2 = new Triangle();
        Layer layer = new Layer("layer1");
        Layer layer2 = new Layer("layer2");
        layer.addShape(retangle);
        layer.addShape(triangle);
        layer.addShape(triangle1);
        layer.addShape(circle);
        layer.addShape(square);
        layer.addShape(triangle2);
        layer2.addShape(triangle1);
        layer2.addShape(circle);
        layer2.addShape(square);
        Diagram diagram = new Diagram();
        diagram.addLayer(layer);
        diagram.addLayer(layer2);
        diagram.showAllLayer();
        System.out.println();
        diagram.removeAllCircle();
        diagram.showAllLayer();
        System.out.println();
        diagram.listLayer.get(0).removeAllTriangle();
        diagram.showAllLayer();

    }
}
