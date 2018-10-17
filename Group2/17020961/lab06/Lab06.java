/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.util.*;
public class Lab06 {

  
    public static void main(String[] args) {
        //tao cac shape
        Shape rectangle = new Rectangle(new ToaDo(20, 20), new ToaDo(50,55));
        Shape square = new Square(new ToaDo(60,60), new ToaDo(70,70));
        Shape circle = new Circle(new ToaDo(30,10), 1);
        Shape triangle = new Triangle(new ToaDo(200,100), new ToaDo(100,200), new ToaDo(250,250));
        Diagram diagram = new Diagram();
        ArrayList<Layer> listLayer = new ArrayList<>();//tao list Layer
        diagram.setListLayer(listLayer);
        Layer layer = new Layer();
        ArrayList<Shape> listShape = new ArrayList<>(); //tao List Shape
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
