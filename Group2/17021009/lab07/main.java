package Tuan7;

import java.util.ArrayList;

public class main {



    public static void main(String[] args) {

        shape circle = new circle(new point(10,10), 1);
        shape rectangle = new rectangle(new point(20, 20), new point(50,55));
        shape square = new square(new point(60,60), new point(70,70));
        shape triangle = new triangle(new point(100,100), new point(100,200), new point(200,250));
        diagram diagram = new diagram();

        ArrayList<layer> listLayer = new ArrayList<>();
        diagram.setListLayer(listLayer);
        layer layer = new layer();
        ArrayList<shape> listShape = new ArrayList<>();
        listShape.add(circle);
        listShape.add(rectangle);
        listShape.add(square);
        listShape.add(triangle);
        layer.setListShape(listShape);
        listLayer.add(layer);

        diagram.removeAllCircle();
        diagram.getListLayer().get(0).removeAllTriangle();
        System.out.println(listShape.size());

        diagram.setListLayer(listLayer);
        diagram.deleteShape(listLayer);
    }
}
